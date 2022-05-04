package com.example.taserfan;

public class AuthenticationData {
    private String email;
    private String password;

    public AuthenticationData(String mail, String passwd) {
        this.email = mail;
        this.password = passwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
