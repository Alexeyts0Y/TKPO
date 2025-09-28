package com.example.factory.services;

import com.example.factory.entities.LineShape;
import com.example.factory.entities.TetrisShape;

public class LineCreator extends ShapeCreator {

    @Override
    public TetrisShape creatShape() {
        return new LineShape();
    }
    
}
