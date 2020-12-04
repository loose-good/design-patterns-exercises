package p1;

public class MushroomPizza extends DecoratedPizza {
    protected MushroomPizza(Pizza pizza) {
        super(pizza);
    }

    protected void printExtraIngredient() {
        System.out.println("Mushroom");
    }

    protected int getIngredientCost() {
        return 4;
    }
}
