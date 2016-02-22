package pattern.chainofresponsibility;

/**
 * Created by gauravs on 18/2/16.
 */
public class Request {
    private int m_value;
    private String m_description;

    public Request(String m_description, int value)
    {
        this.m_description = m_description;
        this.m_value=value;
    }
    public int getValue()
    {
        return m_value;
    }

    public String getDescription()
    {
        return m_description;
    }
}
