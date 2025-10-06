package com.example.chain_of_responsibilities;

import com.example.classes.User;

public abstract class UserHandler {

    protected UserHandler nextHandler;

    public UserHandler setNext(UserHandler handler) {
        this.nextHandler = handler;
        return handler;
    }

    public abstract boolean handle(User user);

    protected boolean handleNext(User user) {
        if (nextHandler == null) {
            return true;
        }
        return nextHandler.handle(user);
    }
}
