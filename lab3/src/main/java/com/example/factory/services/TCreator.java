package com.example.factory.services;

import com.example.factory.entities.TShape;
import com.example.factory.entities.TetrisShape;

public class TCreator extends ShapeCreator {
    
    @Override
    public TetrisShape creatShape() {
        return new TShape();
    }
    
}
