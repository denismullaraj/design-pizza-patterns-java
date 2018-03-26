package structural.proxy;

/**
 * Created by denis.mullaraj on 26/03/2018.
 */
public class PizzeriaNapoli implements Pizzeria {

    @Override
    public String pizza(String pizzaName) {
        return String.format("Pizza %s", pizzaName);
    }
}
