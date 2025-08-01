package hu.cubix.koszegig.logosztics.logosztics.service;

import hu.cubix.koszegig.logosztics.logosztics.model.LgUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.*;

import java.util.Collection;

public class LogoszticsUser extends User {

    private LgUser lgUser;

    public LogoszticsUser(String username, String password, Collection<? extends GrantedAuthority> authorities, LgUser lgUser) {
        super(username, password, authorities);
        this.lgUser = lgUser;
    }

    public LgUser getLgUser() {
        return lgUser;
    }

    public void setLgUser(LgUser lgUser) {
        this.lgUser = lgUser;
    }
}
