package hu.cubix.koszegig.logosztics.logosztics.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.time.Duration;

@ConfigurationProperties(prefix = "logosztics")
@Component
public class ApplicationConfigProperties {
    private JwtData jwtData = new JwtData();
    public static class JwtData {
        private String issuer;
        private String secret;
        private String alg;

        public String getIssuer() {
            return issuer;
        }

        public void setIssuer(String issuer) {
            this.issuer = issuer;
        }

        public String getSecret() {
            return secret;
        }

        public void setSecret(String secret) {
            this.secret = secret;
        }

        public String getAlg() {
            return alg;
        }

        public void setAlg(String alg) {
            this.alg = alg;
        }

        public Duration getDuration() {
            return duration;
        }

        public void setDuration(Duration duration) {
            this.duration = duration;
        }

        private Duration duration;
    }
    public JwtData getJwtData() {
        return jwtData;
    }

    public void setJwtData(JwtData jwtData) {
        this.jwtData = jwtData;
    }
}
