package com.example.factory.services;

import com.example.factory.entities.SuperSquareShape;
import com.example.factory.entities.TetrisShape;

public class SuperSquareCreator extends ShapeCreator {
    
    @Override
    public TetrisShape creatShape() {
        return new SuperSquareShape();
    }
    
}
