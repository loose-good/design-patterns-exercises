package p2;

import java.util.Arrays;
import java.util.List;

public abstract class CompositeExpression implements Expression {

    protected List<Expression> expressions;

    public CompositeExpression(Expression... expressions) {
        this.expressions = Arrays.asList(expressions);
    }

    @Override
    public void print() {
        for (int i = 0; i < expressions.size() - 1; i++) {
            expressions.get(i).print();
            printOperator();
        }
        expressions.get(expressions.size() - 1).print();
    }

    protected abstract void printOperator();
}
