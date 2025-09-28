package com.example.factory.entities;

public class TShape extends TetrisShape {

    public TShape() {
        this.cells = 4;
        this.color = "Green";
    }

    @Override
    public void draw() {
        System.out.println("Drawing T shape (" + cells + " cells)");
    }
    
}
