package pattern.abstractfactory.tutorialpoint;

import sun.security.provider.SHA;

/**
 * Created by gauravs on 17/2/16.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}


class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType)
    {
        if(shapeType == null)
            return null;

        if(shapeType.equalsIgnoreCase("circle"))
            return new Circle();
        else if(shapeType.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        else if(shapeType.equalsIgnoreCase("square"))
            return new Square();

        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}

class ColorFactory extends AbstractFactory
{
    @Override
    public Shape getShape(String shapeType)
    {
        return null;
    }

    @Override
    Color getColor(String color)
    {
        if(color == null)
            return null;

        if(color.equalsIgnoreCase("red"))
            return new Red();
        else if(color.equalsIgnoreCase("green"))
            return new Green();
        else if(color.equalsIgnoreCase("blue"))
            return new Blue();

        return null;
    }
}