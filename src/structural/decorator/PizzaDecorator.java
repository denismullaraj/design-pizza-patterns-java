package structural.decorator;

/**
 * Created by denis.mullaraj on 17.3.18.
 */
public class PizzaDecorator implements Pizza{

    private Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getIngredients() {
        return pizza.getIngredients();
    }

    @Override
    public double getPrice() {
        return pizza.getPrice();
    }
}
