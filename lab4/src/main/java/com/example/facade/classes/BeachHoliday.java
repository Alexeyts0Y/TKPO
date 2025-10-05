package com.example.facade.classes;

public class BeachHoliday {
    private int days;
    private String country;
    private int hotelStars;
    private String mealPlan;

    public BeachHoliday(int days, String country, int hotelStars, String mealPlan) {
        this.days = days;
        this.country = country;
        this.hotelStars = hotelStars;
        this.mealPlan = mealPlan;
    }

    public double calculateCost() {
        double base = days * 50;
        double hotelRate = hotelStars * 30;
        double mealRate = switch(mealPlan) {
            case "двухразовый" -> 20;
            case "трехразовый" -> 35;
            case "всё включено" -> 60;
            default -> 0;
        };
        return base + (hotelRate + mealRate) * days;
    }
}
