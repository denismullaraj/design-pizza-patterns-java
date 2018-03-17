package structural.decorator;

/**
 * Created by denis.mullaraj on 17.3.18.
 */
public class Pomodoro extends PizzaDecorator {

    public Pomodoro(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Pomodoro";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.5;
    }
}
