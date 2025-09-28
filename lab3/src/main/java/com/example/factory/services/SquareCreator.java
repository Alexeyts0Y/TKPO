package com.example.factory.services;

import com.example.factory.entities.SquareShape;
import com.example.factory.entities.TetrisShape;

public class SquareCreator extends ShapeCreator {

    @Override
    public TetrisShape creatShape() {
        return new SquareShape();
    }
    
}
