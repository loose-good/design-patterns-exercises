package p3.factories;

import p3.Engine;

public interface EngineFactory {
    Engine createEngine(String type);
}
