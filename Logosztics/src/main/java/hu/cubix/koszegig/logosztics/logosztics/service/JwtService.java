package hu.cubix.koszegig.logosztics.logosztics.service;

import hu.cubix.koszegig.logosztics.logosztics.config.ApplicationConfigProperties;
import hu.cubix.koszegig.logosztics.logosztics.config.ApplicationConfigProperties.JwtData;
import hu.cubix.koszegig.logosztics.logosztics.model.LgUser;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator.Builder;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class JwtService {

    private static final String USERNAME = "username";
    private static final String ID = "id";
    private static final String FULLNAME = "fullname";
    private static final String FIRSTNAME = "firstname";
    private static final String LASTNAME = "lastname";
    private static final String AUTH = "auth";
    private static Algorithm algorithm;// = Algorithm.HMAC256("mysecret");
    private static String ISSUER;

    @Autowired
    ApplicationConfigProperties applicationConfigProperties;

    @PostConstruct
    public void init(){
        JwtData jwtData = applicationConfigProperties.getJwtData();
        ISSUER = jwtData.getIssuer();
        try {
            algorithm = (Algorithm) Algorithm.class.getMethod(jwtData.getAlg(), String.class)
                    .invoke(null, jwtData.getSecret());
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
        }

    }
    public String createJwt(UserDetails userDetails) {
        LgUser lgUser = ((LogoszticsUser)userDetails).getLgUser();

        Builder jwtBuilder = JWT.create()
                .withSubject(userDetails.getUsername())
                .withArrayClaim(AUTH, userDetails.getAuthorities().stream().map(GrantedAuthority::getAuthority).toArray(String[]::new))
                .withClaim(USERNAME, lgUser.getUsername())
                .withClaim(FIRSTNAME, lgUser.getUserFirstname())
                .withClaim(LASTNAME, lgUser.getUserLastname())
                .withClaim(FULLNAME, lgUser.getUserFullname())
                .withClaim(ID, lgUser.getUserId());


        return jwtBuilder
                .withExpiresAt(new Date(System.currentTimeMillis() + applicationConfigProperties.getJwtData().getDuration().toMillis()))
                .withIssuer(ISSUER)
                .sign(algorithm);
    }



    public UserDetails parseJwt(String jwtToken) {

        DecodedJWT decodedJwt = JWT.require(algorithm)
                .withIssuer(ISSUER)
                .build()
                .verify(jwtToken);
        LgUser lgUser = new LgUser();
        lgUser.setUserId(decodedJwt.getClaim(ID).asLong());
        lgUser.setUsername(decodedJwt.getClaim(USERNAME).asString());
        lgUser.setUserFirstname(decodedJwt.getClaim(FIRSTNAME).asString());
        lgUser.setUserFirstname(decodedJwt.getClaim(LASTNAME).asString());
        lgUser.setUsername(decodedJwt.getClaim(USERNAME).asString());

        return new LogoszticsUser(
                decodedJwt.getSubject(),
                "dummy",
                decodedJwt.getClaim(AUTH).asList(String.class).stream()
                        .map(SimpleGrantedAuthority::new).toList(),
                lgUser);
    }


}
