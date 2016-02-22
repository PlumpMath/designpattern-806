package pattern.builder.oodesign.ex1;

/**
 * Created by gauravs on 18/2/16.
 */
public class ASCIIText {
    StringBuilder text = new StringBuilder();
    public void append(char c)
    {
        text.append(c);
    }

    @Override
    public String toString()
    {
        return text.toString();
    }
}
