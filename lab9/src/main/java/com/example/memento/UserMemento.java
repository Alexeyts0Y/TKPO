package com.example.memento;

public class UserMemento {

    private final String login;
    private final String password;
    private final String role;

    public UserMemento(String login, String password, String role) {
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public String getLogin() {
        return login;
    }
    
    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }
}
