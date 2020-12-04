package p2;

public class Subtraction extends CompositeExpression {
    public Subtraction(Expression... expressions) {
        super(expressions);
    }

    @Override
    protected void printOperator() {
        System.out.println(" - ");
    }

    @Override
    public double eval() {
        double start = expressions.get(0).eval();

        for (int i = 1; i < expressions.size(); i++) {
            start -= expressions.get(i).eval();
        }

        return start;
    }
}
