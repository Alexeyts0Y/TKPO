package services;

import entities.Engine;
import entities.JetEngine;

public class EngineController {
    
    public void startEngine(Engine engine) {
        engine.start();
    }

    public void stopEngine(Engine engine) {
        engine.stop();
    }

    public void toggleAfterburner(JetEngine engine) {
        engine.toggleAfterburner();
    }
}
