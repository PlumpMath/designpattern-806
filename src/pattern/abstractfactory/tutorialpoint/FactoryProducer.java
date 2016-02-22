package pattern.abstractfactory.tutorialpoint;

/**
 * Created by gauravs on 17/2/16.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice)
    {
        if(choice.equalsIgnoreCase("Shape"))
            return new ShapeFactory();
        else if(choice.equalsIgnoreCase("Color"))
            return new ColorFactory();

        return null;
    }
}
