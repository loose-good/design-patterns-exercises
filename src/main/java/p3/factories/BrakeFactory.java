package p3.factories;

import p3.Brake;

public interface BrakeFactory {
    Brake createBrake(String type);
}
