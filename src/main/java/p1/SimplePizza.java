package p1;

public class SimplePizza implements Pizza {
    public void print() {
        System.out.println("Ketchup, Mozzarella");
    }

    public int cost() {
        return 10;
    }
}
