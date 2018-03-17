package structural.decorator;

/**
 * Created by denis.mullaraj on 17.3.18.
 */
public class Mozzarella extends PizzaDecorator {

    public Mozzarella(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Mozzarella";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1;
    }
}
