package com.example;

import com.example.classes.Administrator;
import com.example.classes.Guest;
import com.example.classes.User;
import com.example.decorators.TwoFactorAuthDecorator;
import com.example.decorators.VerifiedEmailDecorator;


public class Main {
    public static void main(String[] args) {
        User admin = new Administrator("superuser", "admin123");
        User guest = new Guest("visitor", "");

        User decoratedAdmin = new VerifiedEmailDecorator(admin, true);
        decoratedAdmin = new TwoFactorAuthDecorator(decoratedAdmin, true);

        User decoratedGuest = new VerifiedEmailDecorator(guest, false);

        System.out.println("=== Декорированный администратор ===");
        decoratedAdmin.display();

        System.out.println("\n=== Декорированный гость ===");
        decoratedGuest.display();
    }
}