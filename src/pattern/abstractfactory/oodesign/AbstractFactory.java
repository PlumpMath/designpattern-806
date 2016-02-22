package pattern.abstractfactory.oodesign;

/**
 * Created by gauravs on 17/2/16.
 */
abstract public class AbstractFactory {
    abstract AbstractProductA createProductA();
    abstract AbstractProductB createProductB();
}

class ConcreteFactory1 extends AbstractFactory{

    @Override
    AbstractProductA createProductA() {
        return new ProductA1("ProductA1");
    }

    @Override
    AbstractProductB createProductB() {
        return new ProductB1("ProductB1");
    }
}

class ConcreteFactory2 extends AbstractFactory{
    AbstractProductA createProductA()
    {
        return new ProductA2("ProductA2");
    }
    AbstractProductB createProductB()
    {
        return new ProductB2("ProductB2");
    }
}