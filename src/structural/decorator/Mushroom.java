package structural.decorator;

/**
 * Created by denis.mullaraj on 17.3.18.
 */
class Mushroom extends PizzaDecorator {

    Mushroom(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Mushroom";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1;
    }
}
