package com.example.factory.entities;

public class SquareShape extends TetrisShape {

    public SquareShape() {
        this.cells = 4;
        this.color = "Red";
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing Square shape (" + cells + " cells)");
    }
    
}
