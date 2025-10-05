package com.example.facade.classes;

public class Skiing {

    private int days;
    private String country;
    private int hotelStars;
    private String mealPlan;

    public Skiing(int days, String country, int hotelStars, String mealPlan) {
        this.days = days;
        this.country = country;
        this.hotelStars = hotelStars;
        this.mealPlan = mealPlan;
    }

    public double calculateCost() {
        double base = days * 70;
        double hotelRate = hotelStars * 40;
        double mealRate = switch(mealPlan) {
            case "двухразовый" -> 25;
            case "трехразовый" -> 40;
            case "всё включено" -> 75;
            default -> 0;
        };
        return base + (hotelRate + mealRate) * days;
    }
}
