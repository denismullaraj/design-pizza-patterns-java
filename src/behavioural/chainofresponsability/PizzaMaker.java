package behavioural.chainofresponsability;

/**
 * Created by denis.mullaraj on 30/03/2018.
 */
public class PizzaMaker extends RequestHandler {

    PizzaMaker(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType().equals(Request.RequestType.MAKE_PIZZA)){
            trackHandling(request);
        } else {
            super.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return "Pizza maker";
    }
}
