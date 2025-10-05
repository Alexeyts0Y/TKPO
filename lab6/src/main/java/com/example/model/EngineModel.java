package com.example.model;

import com.example.classes.ConcreteSubject;

public class EngineModel extends ConcreteSubject {
    
    private String type;
    private double power;

    public String getType() {
        return this.type;
    }

    public double getPower() {
        return this.power;
    }

    public void setType(String type) {
        this.type = type;
        notifyObservers();
    }

    public void setPower(double power) {
        this.power = power;
        notifyObservers();
    }
}
