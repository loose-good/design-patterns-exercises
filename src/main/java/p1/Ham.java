package p1;

public class Ham extends DecoratedPizza {
    protected Ham(Pizza pizza) {
        super(pizza);
    }

    protected void printExtraIngredient() {
        System.out.println("Ham");
    }

    protected int getIngredientCost() {
        return 5;
    }
}
