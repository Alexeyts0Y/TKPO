package com.example.chain_of_responsibilities;

import com.example.classes.User;

public class AuthenticationHandler extends UserHandler {
    
    @Override
    public boolean handle(User user) {
        if (user.getPassword() == null || user.getPassword().isEmpty()) {
            System.out.println("Ошибка аутентификации: Пустой пароль для " + user.getLogin());
            return false;
        }
        System.out.println("Аутентификация пройдена для " + user.getLogin());
        return handleNext(user);
    }
}
