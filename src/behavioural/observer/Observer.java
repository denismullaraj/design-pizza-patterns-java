package behavioural.observer;

/**
 * Observer Interface
 * Created by denis.mullaraj on 24.3.18.
 */
public interface Observer {

    /**
     * Receives notification from observable/subject
     * @param message
     */
    void update(String message);

}
