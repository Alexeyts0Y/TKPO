package com.example.factory.services;

import com.example.factory.entities.SuperLineShape;
import com.example.factory.entities.TetrisShape;

public class SuperLineCreator extends ShapeCreator {

    @Override
    public TetrisShape creatShape() {
        return new SuperLineShape();
    }
}
