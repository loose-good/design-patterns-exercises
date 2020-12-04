package p3;

import p3.factories.BodyFactory;
import p3.factories.BrakeFactory;
import p3.factories.EngineFactory;

public class Robot {

    private EngineFactory engineFactory;
    private BrakeFactory brakeFactory;
    private BodyFactory bodyFactory;

    public Robot(EngineFactory engineFactory, BrakeFactory brakeFactory, BodyFactory bodyFactory) {
        this.engineFactory = engineFactory;
        this.brakeFactory = brakeFactory;
        this.bodyFactory = bodyFactory;
    }

    public Car assembleCar(String engineType,
                           String brakeType,
                           String bodyType) {

        try {
            Engine engine = engineFactory.createEngine(engineType);
            Brake brake = brakeFactory.createBrake(brakeType);
            Body body = bodyFactory.createBody(bodyType);
            return new Car(engine, brake, body);
        } catch (UnknownCarPartException e) {
            throw new CouldNotBuildCarException(e);
        }

    }

    public void setEngineFactory(EngineFactory engineFactory) {
        this.engineFactory = engineFactory;
    }

    public void setBrakeFactory(BrakeFactory brakeFactory) {
        this.brakeFactory = brakeFactory;
    }

    public void setBodyFactory(BodyFactory bodyFactory) {
        this.bodyFactory = bodyFactory;
    }
}
