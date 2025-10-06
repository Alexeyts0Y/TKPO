package com.example.decorators;

import com.example.classes.User;

public class VerifiedEmailDecorator extends UserDecorator {
    
    private boolean isEmailVerified;

    public VerifiedEmailDecorator(User decoratedUser, boolean isEmailVerified) {
        super(decoratedUser);
        this.isEmailVerified = isEmailVerified;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Email Verified: " + isEmailVerified);
    }

    public boolean isEmailVerified() {
        return isEmailVerified;
    }
}
