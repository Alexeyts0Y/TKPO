package com.example.view;

import com.example.interfaces.Observer;
import com.example.model.EngineModel;

public class EngineView implements Observer {
    
    private EngineModel model;

    public EngineView(EngineModel model) {
        this.model = model;
        this.model.addObserver(this);
    }

    @Override
    public void update() {
        printDetails();
    }

    public void printDetails() {
        System.out.println("=== Данные двигателя ===");
        System.out.println("Тип: " + model.getType());
        System.out.println("Мощность: " + model.getPower() + " л.с.");
        System.out.println();
    }
}
