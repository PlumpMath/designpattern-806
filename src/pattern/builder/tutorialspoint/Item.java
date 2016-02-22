package pattern.builder.tutorialspoint;

/**
 * Created by gauravs on 18/2/16.
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}

 abstract class Burger implements Item
{
    @Override
    public Packing packing()
    {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}

abstract class ColdDrink implements Item
{
    @Override
    public Packing packing()
    {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
