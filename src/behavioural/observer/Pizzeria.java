package behavioural.observer;

/**
 * Created by denis.mullaraj on 24.3.18.
 */
public class Pizzeria {

    public static void main(String[] args) {
        boolean available = true;
        Pizza pizzaCapricciosa = new Pizza("Pizza Capricciosa");

        PizzaDeliveryDriver driverEast = new PizzaDeliveryDriver("Driver East");
        PizzaDeliveryDriver driverSouth = new PizzaDeliveryDriver("Driver South");
        PizzaDeliveryDriver driverNorth = new PizzaDeliveryDriver("Driver North");

        pizzaCapricciosa.addObserver(driverEast);
        pizzaCapricciosa.addObserver(driverSouth);
        pizzaCapricciosa.addObserver(driverNorth);

        for(int i=0; i<3; i++) {

            // Set availability based on value of "i"
            boolean avaiable = i%2 == 0;
            pizzaCapricciosa.setStatus(avaiable);

            // Remove one of the observers (example)
            if (i == 1) {
                pizzaCapricciosa.removeObserver(driverNorth);
            }

            System.out.println("--------------------------------");
        }
    }

}
