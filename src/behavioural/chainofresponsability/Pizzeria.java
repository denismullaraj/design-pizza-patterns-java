package behavioural.chainofresponsability;

/**
 * Created by denis.mullaraj on 30/03/2018.
 */
public class Pizzeria {

    public static void main(String[] args) {
        PizzeriaManager manager = new PizzeriaManager();

        manager.makeRequest(new Request(Request.RequestType.HANDLE_ORDER, "please 1 pizza margherita in Milano"));
        manager.makeRequest(new Request(Request.RequestType.MAKE_PIZZA, "make 1 pizza margherita"));
        manager.makeRequest(new Request(Request.RequestType.DELIVER_PIZZA, "deliver in Milano"));
    }

}
