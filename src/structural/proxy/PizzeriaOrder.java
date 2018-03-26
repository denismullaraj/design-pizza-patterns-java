package structural.proxy;

import java.util.Arrays;
import java.util.List;

/**
 * Created by denis.mullaraj on 26/03/2018.
 */
public class PizzeriaOrder {

    public static void main(String[] args) {
        List<String> orders = Arrays.asList("Margherita", "Tartufo", "Vegetariana", "4 Formaggi", "Sweet");

        Pizzeria pizzeria = new PizzeriaProxy();

        for(String order: orders){
            System.out.println(pizzeria.pizza(order));
        }
    }

}
