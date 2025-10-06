package com.example.classes;

public class Administrator extends User {
    
    public Administrator() {
        super();
        this.role = "Administrator";
    }

    public Administrator(String login, String password) {
        super(login, password, "Administrator");
    }

    public Administrator(Administrator other) {
        super(other);
    }

    @Override
    public void input() {
        super.input();
        this.role = "Administrator";
    }
}
