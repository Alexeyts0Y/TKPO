package com.example.facade.classes;

public class Excursion {
    
    private int days;
    private String country;
    private int hotelStars;
    private String mealPlan;

    public Excursion(int days, String country, int hotelStars, String mealPlan) {
        this.days = days;
        this.country = country;
        this.hotelStars = hotelStars;
        this.mealPlan = mealPlan;
    }

    public double calculateCost() {
        double base = days * 40;
        double hotelRate = hotelStars * 25;
        double mealRate = switch(mealPlan) {
            case "двухразовый" -> 15;
            case "трехразовый" -> 25;
            case "всё включено" -> 50;
            default -> 0;
        };
        return base + (hotelRate + mealRate) * days;
    }
}
