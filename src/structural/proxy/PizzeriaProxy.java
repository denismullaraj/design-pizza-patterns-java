package structural.proxy;

import java.util.Arrays;
import java.util.List;

/**
 * Created by denis.mullaraj on 26/03/2018.
 */
public class PizzeriaProxy implements Pizzeria {

    private List<String> unavailablePizza = Arrays.asList("Sweet", "Tartufo", "Frutti di Mare");

    @Override
    public String pizza(String pizzaName) {
        tracePizzaOrder(pizzaName);
        if(unavailablePizza.contains(pizzaName)){
            return "Unfourtunately we don't serve yet this Pizza, but we will try to serve it in the near future! Thank you for choosing us!";
        }

        return new PizzeriaNapoli().pizza(pizzaName);
    }

    private void tracePizzaOrder(String pizzaName){
        System.out.printf("Ordered %s on %d. Availability: ", pizzaName, System.currentTimeMillis());
    }
}
