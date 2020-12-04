package p3;

public class CouldNotBuildCarException extends RuntimeException {
    public CouldNotBuildCarException(UnknownCarPartException e) {
        super(e);
    }
}
