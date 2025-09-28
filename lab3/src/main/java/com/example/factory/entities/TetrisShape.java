package com.example.factory.entities;

public abstract class TetrisShape {
    
    protected int cells;
    protected String color;

    public abstract void draw();

    public int getCells() {
        return this.cells;
    }
}
