package com.example.decorators;

import com.example.classes.User;

public class UserDecorator extends User {
    
    protected User decoratedUser;

    public UserDecorator(User decoratedUser) {
        super(decoratedUser.getLogin(), decoratedUser.getPassword(), decoratedUser.getRole());
        this.decoratedUser = decoratedUser;
    }

    @Override
    public void display() {
        decoratedUser.display();
    }
}
