package behavioural.observer;

import java.util.List;

/**
 * Created by denis.mullaraj on 24.3.18.
 */
public class Pizza implements Observable{

    /**
     * Pizza name
     */
    private String pizzaName;

    /**
     * Pizza status: available or not for delivery;
     * Observers like PizzaDeliveryDriver are interested in this status
     */
    private String status;

    /**
     * List that holds all the observers
     */
    private List<Observer> observerList;

    @Override
    public void addObserver(Observer observer) {

    }

    @Override
    public void removeObserver(Observer observer) {

    }

    @Override
    public void notifyAllObservers() {

    }
}
