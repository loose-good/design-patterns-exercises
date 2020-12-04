package p3;

import p3.factories.BrakeFactoryImpl;
import p3.factories.EngineFactoryImpl;
import p3.factories.UnknownBodyTypeException;
import p3.factories.UnknownEngineTypeException;

public class Main {

    public static void main(String[] args) {
        Robot robot = new Robot(new EngineFactoryImpl(), new BrakeFactoryImpl(),
                type -> {
                    switch (type) {
                        case "Simple":
                            return new SimpleBody();
                        case "Sport":
                            return new SportBody();
                        case "Combi":
                            return new CombiBody();
                        default:
                            throw new UnknownBodyTypeException();
                    }
                });

        Car car = robot.assembleCar("TSI 1.2", "Normal", "Combi");
        robot.setEngineFactory(type -> {
            switch (type) {
                case "TSI 1.2":
                    return new TSI_1_2();
                case "TSI 1.8":
                    return new TSI_1_8();
                default:
                    throw new UnknownEngineTypeException();
            }
        });
        Car car2 = robot.assembleCar("Diesel", "HH", "Sport");

        System.out.println(car);
        System.out.println(car2);
    }
}
