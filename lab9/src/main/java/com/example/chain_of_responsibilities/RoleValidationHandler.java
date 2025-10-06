package com.example.chain_of_responsibilities;

import com.example.classes.User;

public class RoleValidationHandler extends UserHandler {
    
    @Override
    public boolean handle(User user) {
        String role = user.getRole();
        if (role == null || (!role.equals("Admin") && !role.equals("User") && !role.equals("Guest"))) {
            System.out.println("Проверка роли не пройдена для " + user.getLogin());
            return false;
        }
        System.out.println("Проверка роли пройдена для " + user.getLogin());
        return handleNext(user);
    }
}
