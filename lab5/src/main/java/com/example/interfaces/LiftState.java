package com.example.interfaces;

public interface LiftState {
    void callToFloor(int floor);
    void load(double weight);
    void unload(double weight);
    void restorePower();
    String getStateName();
}