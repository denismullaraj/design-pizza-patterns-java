package behavioural.chainofresponsability;

import java.net.Authenticator;

/**
 * Created by denis.mullaraj on 30/03/2018.
 */
public class Request {

    private final RequestType requestType;
    private final String requestDescription;

    Request(final RequestType requestType, String requestDescription){
        this.requestType = requestType;
        this.requestDescription = requestDescription;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    String getRequestDescription() {
        return requestDescription;
    }

    @Override
    public String toString() {
        return getRequestDescription();
    }

    public enum RequestType {
        HANDLE_ORDER, MAKE_PIZZA, DELIVER_PIZZA
    }
}
