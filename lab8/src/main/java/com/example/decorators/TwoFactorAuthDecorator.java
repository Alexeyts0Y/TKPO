package com.example.decorators;

import com.example.classes.User;

public class TwoFactorAuthDecorator extends UserDecorator {

    private boolean twoFactorEnabled;

    public TwoFactorAuthDecorator(User decoratedUser, boolean twoFactorEnabled) {
        super(decoratedUser);
        this.twoFactorEnabled = twoFactorEnabled;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("2FA Enabled: " + twoFactorEnabled);
    }
    
    public boolean isTwoFactorEnabled() {
        return twoFactorEnabled;
    }
}
