package com.example.factory.entities;

public class SuperLineShape extends TetrisShape {

    public SuperLineShape() {
        this.cells = 8;
        this.color = "Silver";
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing SUPER Line shape (" + cells + " cells)");
    }
    
}
