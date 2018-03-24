package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of the Observable
 * Created by denis.mullaraj on 24.3.18.
 */
class Pizza implements Observable{

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

    Pizza(String pizzaName) {
        this.pizzaName = pizzaName;
        this.observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for(Observer observer: observerList){
            observer.update(status);
        }
    }

    /**
     * Set the pizza status based on availability and notify all observers
     * @param available
     */
    void setStatus(boolean available){
        status = pizzaName + (available ? " is available": " is not available");
        notifyAllObservers();
    }
}
