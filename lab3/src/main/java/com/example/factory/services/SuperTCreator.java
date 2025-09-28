package com.example.factory.services;

import com.example.factory.entities.SuperTShape;
import com.example.factory.entities.TetrisShape;

public class SuperTCreator extends ShapeCreator {
    
    @Override
    public TetrisShape creatShape() {
        return new SuperTShape();
    }
    
}
