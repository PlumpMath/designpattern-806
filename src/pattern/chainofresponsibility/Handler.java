package pattern.chainofresponsibility;

/**
 * Created by gauravs on 18/2/16.
 */
public abstract class Handler {
    protected Handler m_successor;

    public void setSuccessor(Handler successor)
    {
        m_successor = successor;
    }

    public abstract void handleRequest(Request request);
}
