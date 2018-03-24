package behavioural.observer;

/**
 * The Observable (Subject) Interface
 * Created by denis.mullaraj on 24.3.18.
 */
public interface Observable {

    /**
     * Add observer
     * @param observer
     */
    void addObserver(Observer observer);

    /**
     * Remove observer
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * Notify all observers of this observable (subject)
     */
    void notifyAllObservers();

}
