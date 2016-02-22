package pattern.abstractfactory.tutorialpoint;

/**
 * Created by gauravs on 17/2/16.
 */
public class Client {
    public static void main(String...args)
    {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape shape1 =shapeFactory.getShape("circle");

        shape1.draw();


        Shape shape2 = shapeFactory.getShape("square");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("rectangle");
        shape3.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color color1 = colorFactory.getColor("red");
        color1.fill();

        Color color2 = colorFactory.getColor("green");
        color2.fill();

        Color color3 = colorFactory.getColor("blue");
        color3.fill();

    }
}
