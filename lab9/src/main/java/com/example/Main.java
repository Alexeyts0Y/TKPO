package com.example;

import com.example.chain_of_responsibilities.AuthenticationHandler;
import com.example.chain_of_responsibilities.RoleValidationHandler;
import com.example.chain_of_responsibilities.UserHandler;
import com.example.classes.User;
import com.example.composite.UserGroup;
import com.example.memento.UserCaretaker;
import com.example.memento.UserMemento;


public class Main {
    
    public static void main(String[] args) {
        // Создание древовидной структур
        UserGroup rootGroup = new UserGroup("Основная организация");
        UserGroup itDepartment = new UserGroup("IT-отдел");
        UserGroup hrDepartment = new UserGroup("HR-отдел");

        User admin = new User("john", "password123", "Admin");
        User user1 = new User("bob", "bobpass", "User");
        User guest = new User("visitor", "", "Guest");

        itDepartment.add(admin);
        itDepartment.add(user1);
        hrDepartment.add(guest);

        rootGroup.add(itDepartment);
        rootGroup.add(hrDepartment);

        System.out.println("Древовидная структура организации:");
        rootGroup.display();

        // Валидация пользователей
        System.out.println("\nВалидация пользователей через цепочку:");
        UserHandler handlerChain = new AuthenticationHandler();
        handlerChain.setNext(new RoleValidationHandler());

        handlerChain.handle(admin);
        handlerChain.handle(guest);

        // Сохранение и восстановление состояния
        System.out.println("\nРабота со снимками (Memento):");
        UserCaretaker caretaker = new UserCaretaker();

        // Сохраняем начальное состояние
        caretaker.saveState(admin.saveState());

        // Восстанавливаем состояние
        UserMemento savedState = caretaker.undo();
        if (savedState != null) {
            admin.restoreState(savedState);
        }
    }
}