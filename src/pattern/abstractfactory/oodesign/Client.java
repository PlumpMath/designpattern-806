package pattern.abstractfactory.oodesign;

/**
 * Created by gauravs on 17/2/16.
 */
public class Client {
    public static void main(String...args)
    {
        AbstractFactory pf = FactoryMaker.getFactory("a");
        AbstractProductA productA = pf.createProductA();
        System.out.println(productA);
    }
}
