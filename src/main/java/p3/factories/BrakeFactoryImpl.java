package p3.factories;

import p3.Brake;
import p3.HHBrake;
import p3.NormalBrake;

public class BrakeFactoryImpl implements BrakeFactory{
    @Override
    public Brake createBrake(String type) {
        switch (type) {
            case "Normal": return new NormalBrake();
            case "HH": return new HHBrake();
            default: throw new UnknownBrakeTypeException();
        }
    }
}
