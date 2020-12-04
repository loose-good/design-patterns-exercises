package p4;

public class Plus implements Operation {
    @Override
    public double compute(int a, int b) {
        return a + b;
    }
}
