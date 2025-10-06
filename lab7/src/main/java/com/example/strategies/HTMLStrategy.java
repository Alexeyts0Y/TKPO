package com.example.strategies;

import com.example.classes.User;
import com.example.interfaces.UserDisplayStrategy;

public class HTMLStrategy implements UserDisplayStrategy {

    @Override
    public void display(User user) {
        System.out.println("<div class='user'>");
        System.out.println("  <p><strong>Логин:</strong> " + user.getLogin() + "</p>");
        System.out.println("  <p><strong>Роль:</strong> " + user.getRole() + "</p>");
        System.out.println("</div>");
    }
    
}
