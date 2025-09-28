package com.example.factory.entities;

public class SuperSquareShape extends TetrisShape {
    
    public SuperSquareShape() {
        this.cells = 8;
        this.color = "Gold";
    }

    @Override
    public void draw() {
        System.out.println("Drawing SUPER Square shape (" + cells + " cells)");
    }
    
}
