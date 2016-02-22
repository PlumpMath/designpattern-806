package pattern.factorymethod;

/**
 * Created by gauravs on 17/2/16.
 */
public abstract class Creator {
    public Product anOperation()
    {
        return factoryMethod();
    }

    protected abstract Product factoryMethod();
}
