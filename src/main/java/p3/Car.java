package p3;

public class Car {

    private final Engine engine;
    private final Brake brake;
    private final Body body;

    public Car(Engine engine, Brake brake, Body body) {
        this.engine = engine;
        this.brake = brake;
        this.body = body;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine.getClass().getName() +
                ", brake=" + brake.getClass().getName() +
                ", body=" + body.getClass().getName() +
                '}';
    }
}
