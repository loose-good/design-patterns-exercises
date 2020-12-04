package p3.factories;

import p3.Body;

public interface BodyFactory {
    Body createBody(String type);
}
