package p2;

public class Division extends CompositeExpression {
    public Division(Expression... expressions) {
        super(expressions);
    }

    @Override
    protected void printOperator() {
        System.out.print(" / ");
    }

    @Override
    public double eval() {
        double start = expressions.get(0).eval();

        for (int i = 1; i < expressions.size(); i++) {
            start /= expressions.get(i).eval();
        }

        return start;
    }
}
