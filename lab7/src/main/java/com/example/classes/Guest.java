package com.example.classes;

public class Guest extends User {
    
    public Guest() {
        super();
        this.role = "Guest";
    }

    public Guest(String login, String password) {
        super(login, password, "Guest");
    }

    public Guest(Guest other) {
        super(other);
    }

    @Override
    public void input() {
        super.input();
        this.role = "Guest";
    }
}
