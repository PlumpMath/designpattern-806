package pattern.chainofresponsibility;

/**
 * Created by gauravs on 18/2/16.
 */
public class ConcreteHandlerOne extends Handler {
    @Override
    public void handleRequest(Request request) {
        if(request.getValue() < 0)
        {
            System.out.println("Negative values are handled by ConcreteHandlerOne");
            System.out.println("ConcreteHandlerOne.HandleRequest : " + request.getDescription()
                    + request.getValue());
        }
        else
        {
            m_successor.handleRequest(request);
        }
    }
}
