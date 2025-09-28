package com.example.factory.entities;

public class SuperTShape extends TetrisShape {
    
    public SuperTShape() {
        this.cells = 16;
        this.color = "Bronze";
    }

    @Override
    public void draw() {
        System.out.println("Drawing SUPER T shape (" + cells + " cells)");
    }
}
