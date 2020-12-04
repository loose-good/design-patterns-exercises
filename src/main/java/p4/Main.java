package p4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        String operationString = scanner.next();
        Operation operation;

        switch (operationString) {
            case "+":
                operation = new Plus();
                break;
            case "-":
                operation = new Minus();
                break;
            case "/":
                operation = new Slash();
                break;
            case "*":
                operation = new Star();
                break;
            default:
                throw new IllegalArgumentException(operationString);
        }

        System.out.println(operation.compute(x, y));
    }
}
