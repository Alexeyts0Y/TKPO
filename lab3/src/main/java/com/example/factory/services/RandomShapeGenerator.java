package com.example.factory.services;

import java.util.Random;

import com.example.factory.entities.TetrisShape;

public class RandomShapeGenerator {

    private final Random random = new Random();
    
    public TetrisShape generateShape() {
        ShapeCreator creator;
        boolean isSuper = random.nextDouble() < 0.3;
        double randomDouble = random.nextDouble();

        if (randomDouble < 0.3) {
            creator = isSuper ? new SuperSquareCreator() : new SquareCreator();
        } else if (randomDouble > 0.6) {
            creator = isSuper ? new SuperLineCreator() : new LineCreator();
        } else {
            creator = isSuper ? new SuperTCreator() : new TCreator();
        }

        return creator.creatShape();
    }
}
