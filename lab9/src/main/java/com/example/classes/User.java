package com.example.classes;

import java.util.Scanner;

import com.example.interfaces.UserComponent;
import com.example.memento.UserMemento;

public class User implements UserComponent {

    protected String login;
    protected String password;
    protected String role;
    
    public User() {
        this.login = "";
        this.password = "";
        this.role = "User";
    }
    
    public User(String login, String password, String role) {
        this.login = login;
        this.password = password;
        this.role = role;
    }
    
    public User(User other) {
        this.login = other.login;
        this.password = other.password;
        this.role = other.role;
    }
    
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите логин: ");
        this.login = scanner.nextLine();
        System.out.print("Введите пароль: ");
        this.password = scanner.nextLine();
        System.out.print("Введите роль: ");
        this.role = scanner.nextLine();
    }

    
    // 2 метода для реализации паттерна снимок
    public UserMemento saveState() {
        System.out.println("Состояние сохранено для: " + login);
        return new UserMemento(login, password, role);
    }

    public void restoreState(UserMemento memento) {
        this.login = memento.getLogin();
        this.password = memento.getPassword();
        this.role = memento.getRole();
        System.out.println("Состояние восстановлено для: " + login);
    }
    
    @Override
    public void display() {
        System.out.println("Логин: " + login + ", Роль: " + role);
    }
    
    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }
    
    @Override
    public String toString() {
        return "User{login='" + login + "', role='" + role + "'}";
    }

    @Override
    public String getName() {
        return login;
    }
}
