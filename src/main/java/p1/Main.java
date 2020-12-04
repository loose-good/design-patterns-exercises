package p1;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Ham(new Ham(new MushroomPizza(new SimplePizza())));

        System.out.println(pizza.cost());
        pizza.print();
    }
}
