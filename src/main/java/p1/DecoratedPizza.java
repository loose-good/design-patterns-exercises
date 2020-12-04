package p1;

public abstract class DecoratedPizza implements Pizza {

    private final Pizza pizza;

    protected DecoratedPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public void print() {
        pizza.print();
        printExtraIngredient();
    }

    protected abstract void printExtraIngredient();

    public int cost() {
        return pizza.cost() + getIngredientCost();
    }

    protected abstract int getIngredientCost();
}
