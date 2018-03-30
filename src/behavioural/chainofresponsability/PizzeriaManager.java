package behavioural.chainofresponsability;

/**
 * Created by denis.mullaraj on 30/03/2018.
 */
public class PizzeriaManager {

    private RequestHandler chain;

    PizzeriaManager() {
        chain = new Cashier(new PizzaMaker(new PizzaDelivery(null)));
    }

    public void makeRequest(Request request){
        chain.handleRequest(request);
    }
}
