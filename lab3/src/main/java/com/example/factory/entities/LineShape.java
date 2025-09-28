package com.example.factory.entities;

public class LineShape extends TetrisShape {

    public LineShape() {
        this.cells = 4;
        this.color = "Blue";
    }

    @Override
    public void draw() {
        System.out.println("Drawing Line shape (" + cells + " cells)");
    }

}
