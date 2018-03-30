package behavioural.chainofresponsability;

/**
 * Created by denis.mullaraj on 30/03/2018.
 */
public abstract class RequestHandler {

    private RequestHandler nextInChain;

    RequestHandler(RequestHandler nextInChain) {
        this.nextInChain = nextInChain;
    }

    public void handleRequest(Request request){
        if(nextInChain != null){
            nextInChain.handleRequest(request);
        }
    }

    void trackHandling(Request request){
        System.out.printf("%s handling request \"%s\"%n", this, request);
    }

    @Override
    public abstract String toString();
}
