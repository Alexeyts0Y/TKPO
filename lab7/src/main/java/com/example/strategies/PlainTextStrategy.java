package com.example.strategies;

import com.example.classes.User;
import com.example.interfaces.UserDisplayStrategy;

public class PlainTextStrategy implements UserDisplayStrategy {

    @Override
    public void display(User user) {
        System.out.println("Логин: " + user.getLogin() + " | Роль: " + user.getRole());
    }
    
}
