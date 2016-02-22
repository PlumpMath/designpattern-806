package pattern.factorymethod;

/**
 * Created by gauravs on 17/2/16.
 */
public class ConcreteCreator extends Creator {
    @Override
    protected Product factoryMethod() {
        return new ConcreteProduct();
    }
}
