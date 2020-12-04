package p2;

public class Main {
    public static void main(String[] args) {
        Expression e = new ParenthesisExpression(
                new Multiplication(
                        new ParenthesisExpression(
                                new Addition(
                                        new Number(3),
                                        new ParenthesisExpression(
                                                new Addition(
                                                        new Number(5),
                                                        new Number(7)
                                                )
                                        )
                                )
                        ),
                        new Number(3)
                )
        );

        e.print();
        System.out.println("\n" + e.eval());
    }
}

// 5 + 7 * 8
