package com.example.facade.facade_impl;

import com.example.facade.classes.BeachHoliday;
import com.example.facade.classes.Excursion;
import com.example.facade.classes.Skiing;

public class TravelFacade {
    private BeachHoliday beach;
    private Excursion excursion;
    private Skiing skiing;

    public void createBeachHoliday(int days, String country, int hotelStars, String mealPlan) {
        beach = new BeachHoliday(days, country, hotelStars, mealPlan);
    }

    public void createExcursion(int days, String country, int hotelStars, String mealPlan) {
        excursion = new Excursion(days, country, hotelStars, mealPlan);
    }

    public void createSkiing(int days, String country, int hotelStars, String mealPlan) {
        skiing = new Skiing(days, country, hotelStars, mealPlan);
    }

    public double getBeachCost() {
        return beach.calculateCost();
    }

    public double getExcursionCost() {
        return excursion.calculateCost();
    }

    public double getSkiingCost() {
        return skiing.calculateCost();
    }
}
