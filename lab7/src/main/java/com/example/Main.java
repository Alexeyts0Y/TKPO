package com.example;

import java.util.Scanner;

import com.example.classes.Administrator;
import com.example.classes.Application;
import com.example.classes.Guest;
import com.example.classes.User;
import com.example.strategies.HTMLStrategy;
import com.example.strategies.JSONStrategy;
import com.example.strategies.PlainTextStrategy;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Application app = new Application();
        
        app.input();
        
        User admin = new Administrator("admin", "admin123");
        User guest = new Guest("guest", "guest123");
        User regularUser = new User("user1", "pass123", "User");
        
        app.addUser(admin);
        app.addUser(guest);
        app.addUser(regularUser);
        
        boolean running = true;
        while (running) {
            System.out.println("\n=== Меню выбора формата отображения ===");
            System.out.println("1 - Простой текст");
            System.out.println("2 - HTML формат");
            System.out.println("3 - JSON формат");
            System.out.println("4 - Добавить нового пользователя");
            System.out.println("5 - Информация о приложении");
            System.out.println("0 - Выход");
            System.out.print("Выберите опцию: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    app.setDisplayStrategy(new PlainTextStrategy());
                    app.displayAllUsers();
                    break;
                case 2:
                    app.setDisplayStrategy(new HTMLStrategy());
                    app.displayAllUsers();
                    break;
                case 3:
                    app.setDisplayStrategy(new JSONStrategy());
                    app.displayAllUsers();
                    break;
                case 4:
                    addNewUserInteractive(app, scanner);
                    break;
                case 5:
                    app.display();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Неверный выбор!");
            }
        }
        
        scanner.close();
        System.out.println("Программа завершена.");
    }
    
    private static void addNewUserInteractive(Application app, Scanner scanner) {
        System.out.println("\n=== Добавление нового пользователя ===");
        System.out.println("1 - Обычный пользователь");
        System.out.println("2 - Администратор");
        System.out.println("3 - Гость");
        System.out.print("Выберите тип пользователя: ");
        
        int userType = scanner.nextInt();
        scanner.nextLine(); // очистка буфера
        
        User newUser;
        switch (userType) {
            case 1:
                newUser = new User();
                break;
            case 2:
                newUser = new Administrator();
                break;
            case 3:
                newUser = new Guest();
                break;
            default:
                System.out.println("Неверный выбор!");
                return;
        }
        
        newUser.input();
        app.addUser(newUser);
        System.out.println("Пользователь добавлен!");
    }
}