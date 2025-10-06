package com.example.strategies;

import com.example.classes.User;
import com.example.interfaces.UserDisplayStrategy;

public class JSONStrategy implements UserDisplayStrategy {

    @Override
    public void display(User user) {
        System.out.println("{");
        System.out.println("  \"login\": \"" + user.getLogin() + "\",");
        System.out.println("  \"role\": \"" + user.getRole() + "\"");
        System.out.println("},");
    }
    
}
