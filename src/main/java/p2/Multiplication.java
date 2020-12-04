package p2;

public class Multiplication extends CompositeExpression {
    public Multiplication(Expression... expressions) {
        super(expressions);
    }

    @Override
    protected void printOperator() {
        System.out.print(" * ");
    }

    @Override
    public double eval() {
        double product = 1;
        for (Expression expression : expressions) {
            product *= expression.eval();
        }
        return  product;
//        return expressions.stream().mapToDouble(Expression::eval).reduce(1, (left, right) -> left * right);
    }
}
