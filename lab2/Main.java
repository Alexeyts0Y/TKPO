import entities.DieselEngine;
import entities.Engine;
import entities.JetEngine;
import entities.PetrolEngine;
import services.EngineController;

public class Main {
    
    public static void main(String[] args) {
        EngineController controller = new EngineController();

        Engine petrolEngine = new PetrolEngine();
        Engine dieselEngine = new DieselEngine();
        JetEngine jetEngine = new JetEngine();

        controller.startEngine(petrolEngine);
        controller.startEngine(dieselEngine);
        controller.startEngine(jetEngine);

        controller.stopEngine(petrolEngine);
        controller.stopEngine(dieselEngine);
        controller.stopEngine(jetEngine);

        controller.stopEngine(petrolEngine);
        controller.stopEngine(dieselEngine);
        controller.stopEngine(jetEngine);

        controller.toggleAfterburner(jetEngine);
    }
}
