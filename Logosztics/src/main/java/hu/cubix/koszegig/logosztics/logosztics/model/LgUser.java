package hu.cubix.koszegig.logosztics.logosztics.model;

import jakarta.persistence.*;

@Entity
@Table(schema="sys",name = "user")
public class LgUser {
    @Id
    @GeneratedValue
    @Column(name = "usr_id")
    private Long userId;
    @Column(name = "usr_firstname")
    private String userFirstname;
    @Column(name = "usr_lastname")
    private String userLastname;

    @Column(name = "usr_username")
    private String username;
    @Column(name = "usr_password")
    private String password;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserFirstname() {
        return userFirstname;
    }

    public void setUserFirstname(String userFirstname) {
        this.userFirstname = userFirstname;
    }

    public String getUserLastname() {
        return userLastname;
    }

    public void setUserLastname(String userLastname) {
        this.userLastname = userLastname;
    }
    public String getUserFullname() {
        return  this.userFirstname + ' ' + this.userLastname;
    }

    public LgUser(Long userId, String userFirstname, String userLastname, String username, String password) {

        this.userId = userId;
        this.userFirstname = userFirstname;
        this.userLastname = userLastname;
        this.username = username;
        this.password = password;
    }

    public LgUser() {
    }

    @Override
    public String toString() {
        return "LgUser{" +
                "userId=" + this.userId +
                ", userFirstname='" + this.userFirstname + '\'' +
                ", userLastname='" + this.userLastname + '\'' +
                ", username='" + this.username + '\'' +
                '}';
    }
}
