package pattern.builder.tutorialspoint;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

/**
 * Created by gauravs on 18/2/16.
 */
public interface Packing {
    public String pack();
}

class Wrapper implements Packing
{
    @Override
    public String pack()
    {
        return "Wrapper";
    }

}

class Bottle implements Packing
{
    @Override
    public String pack()
    {
        return "Bottle";
    }

}
