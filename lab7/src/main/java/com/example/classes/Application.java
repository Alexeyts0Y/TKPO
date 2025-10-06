package com.example.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.interfaces.UserDisplayStrategy;
import com.example.strategies.PlainTextStrategy;

public class Application {
    
    private String name;
    private double requiredVolume;
    private List<User> users;
    private UserDisplayStrategy displayStrategy;

    public Application() {
        this.name = "";
        this.requiredVolume = 0;
        this.users = new ArrayList<>();
        this.displayStrategy = new PlainTextStrategy();
    }
    
    public Application(String name, double requiredVolume) {
        this.name = name;
        this.requiredVolume = requiredVolume;
        this.users = new ArrayList<>();
        this.displayStrategy = new PlainTextStrategy();
    }
    
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название приложения: ");
        this.name = scanner.nextLine();
        System.out.print("Введите требуемый объем (Мб): ");
        this.requiredVolume = scanner.nextDouble();
        scanner.nextLine();
    }
    
    public void display() {
        System.out.println("Приложение: " + name);
        System.out.println("Требуемый объем: " + requiredVolume + " Мб");
        System.out.println("Количество пользователей: " + users.size());
    }
    
    public void addUser(User user) {
        users.add(user);
    }
    
    public void setDisplayStrategy(UserDisplayStrategy strategy) {
        this.displayStrategy = strategy;
    }
    
    public void displayAllUsers() {
        System.out.println("=== Отображение пользователей ===");
        for (User user : users) {
            displayStrategy.display(user);
        }
        System.out.println("=================================");
    }
    
    public String getName() {
        return name;
    }

    public double getRequiredVolume() {
        return requiredVolume;
    }
    
    public List<User> getUsers() {
        return users;
    }
}
