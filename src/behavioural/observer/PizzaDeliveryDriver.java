package behavioural.observer;

/**
 * Implementation of Observer
 * Created by denis.mullaraj on 25.3.18.
 */
class PizzaDeliveryDriver implements Observer {

    private String name;

    PizzaDeliveryDriver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.printf("%s last updates: %s%n", name, message);
    }
}
