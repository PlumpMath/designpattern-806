package pattern.abstractfactory.oodesign;

/**
 * Created by gauravs on 17/2/16.
 */
public abstract class AbstractProductB {
}
class ProductB1 extends AbstractProductB
{
    ProductB1(String arg)
    {
        System.out.println("Hell "+arg);
    }
}

class ProductB2 extends AbstractProductB{
    ProductB2(String arg)
    {
        System.out.println("Hello "+arg);
    }
}

