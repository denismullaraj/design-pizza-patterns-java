package structural.decorator;

/**
 * Created by denis.mullaraj on 17.3.18.
 */
public class Mushroom extends PizzaDecorator {

    public Mushroom(Pizza pizza) {
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
