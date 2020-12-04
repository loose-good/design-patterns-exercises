package p2;

public class Addition extends CompositeExpression {
    public Addition(Expression... expressions) {
        super(expressions);
    }

    @Override
    protected void printOperator() {
        System.out.print(" + ");
    }

    @Override
    public double eval() {
        return expressions.stream().mapToDouble(Expression::eval).sum();
    }
}
