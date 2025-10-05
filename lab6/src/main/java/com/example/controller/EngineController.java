package com.example.controller;

import com.example.model.EngineModel;

public class EngineController {

    private EngineModel model;

    public EngineController(EngineModel model) {
        this.model = model;
    }
    
    public void setEngineType(String type) {
        model.setType(type);
    }

    public void setEnginePower(double power) {
        model.setPower(power);
    }
}
