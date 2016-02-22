package pattern.abstractfactory.oodesign;

/**
 * Created by gauravs on 17/2/16.
 */
public abstract class AbstractProductA {
    public abstract void operationA1();
    public abstract void operationA2();
}
class ProductA1 extends AbstractProductA
{
    ProductA1(String arg)
    {
        System.out.println("Hello "+arg);
    }
    public void operationA1(){};
    public void operationA2(){};
}
class ProductA2 extends AbstractProductA{
    ProductA2(String arg)
    {
        System.out.println("Hello "+arg);
    }

    @Override
    public void operationA1() {

    }

    @Override
    public void operationA2() {

    }
}
