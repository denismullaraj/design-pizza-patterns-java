package structural.decorator;

/**
 * Created by denis.mullaraj on 17.3.18.
 */
class Mozzarella extends PizzaDecorator {

    Mozzarella(Pizza pizza) {
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
