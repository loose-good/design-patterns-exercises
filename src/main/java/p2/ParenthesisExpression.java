package p2;

public class ParenthesisExpression implements Expression {

    private final Expression expr;

    public ParenthesisExpression(Expression expr) {
        this.expr = expr;
    }

    @Override
    public double eval() {
        return expr.eval();
    }

    @Override
    public void print() {
        System.out.print("(");
        expr.print();
        System.out.print(")");
    }
}
