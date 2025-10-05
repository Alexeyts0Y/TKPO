package com.example.machines;

import com.example.interfaces.LiftState;

public class FiniteStateMachine {
    
    private LiftState currentState;
    
    public FiniteStateMachine(LiftState initialState) {
        this.currentState = initialState;
    }
    
    public void setState(LiftState state) {
        this.currentState = state;
    }
    
    public LiftState getState() {
        return currentState;
    }
    
    public void callToFloor(int floor) {
        currentState.callToFloor(floor);
    }
    
    public void load(double weight) {
        currentState.load(weight);
    }
    
    public void unload(double weight) {
        currentState.unload(weight);
    }
    
    public void restorePower() {
        currentState.restorePower();
    }
}