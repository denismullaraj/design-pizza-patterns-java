package behavioural.chainofresponsability;

/**
 * Created by denis.mullaraj on 30/03/2018.
 */
public class Cashier extends RequestHandler {

    Cashier(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType().equals(Request.RequestType.HANDLE_ORDER)){
            trackHandling(request);
        } else {
            super.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return "Cashier";
    }
}
