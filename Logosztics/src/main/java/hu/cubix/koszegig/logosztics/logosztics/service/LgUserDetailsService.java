package hu.cubix.koszegig.logosztics.logosztics.service;

import hu.cubix.koszegig.logosztics.logosztics.model.LgUser;
import hu.cubix.koszegig.logosztics.logosztics.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LgUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        LgUser lgUser = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException(username));

        return new LogoszticsUser(username, lgUser.getPassword(), List.of(new SimpleGrantedAuthority("USER")), lgUser);
    }
}
