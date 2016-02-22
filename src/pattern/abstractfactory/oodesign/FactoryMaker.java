package pattern.abstractfactory.oodesign;

/**
 * Created by gauravs on 17/2/16.
 */
public class FactoryMaker {
    private static AbstractFactory pf = null;

    static AbstractFactory getFactory(String choice)
    {
        if(choice.equalsIgnoreCase("a")){
            pf = new ConcreteFactory1();
        }
        else
            pf = new ConcreteFactory2();

        return pf;
    }
}
