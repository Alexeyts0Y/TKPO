package com.example.classes;

import java.util.ArrayList;
import java.util.List;

import com.example.interfaces.Observer;
import com.example.interfaces.Subject;

public class ConcreteSubject implements Subject {
    
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }
}
