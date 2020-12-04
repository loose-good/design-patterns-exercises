package p3.factories;

import p3.DieselEngine;
import p3.Engine;
import p3.TSI_1_2;
import p3.TSI_1_8;

public class EngineFactoryImpl implements EngineFactory {
    @Override
    public Engine createEngine(String type) {
        switch (type) {
            case "TSI 1.2":
                return new TSI_1_2();
            case "TSI 1.8":
                return new TSI_1_8();
            case "Diesel":
                return new DieselEngine();
            default:
                throw new UnknownEngineTypeException();
        }
    }
}
