package p2;

public class Number implements Expression {

    private final int n;

    public Number(int n) {
        this.n = n;
    }

    @Override
    public double eval() {
        return n;
    }

    @Override
    public void print() {
        System.out.print(n);
    }
}
