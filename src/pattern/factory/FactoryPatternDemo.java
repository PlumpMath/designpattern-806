package pattern.factory;

/**
 * Created by gauravs on 15/2/16.
 */
public class FactoryPatternDemo {
    public static void main(String...args)
    {
        ShapeFactory shapeFactory = new ShapeFactory();

        shapeFactory.getShape("Circle").draw();

        shapeFactory.getShape("Rectangle").draw();
    }
}

class ShapeFactory {

    public Shape getShape(String shapeType)
    {
        if(shapeType == null)
            return null;

        else if ("Circle".equalsIgnoreCase(shapeType))
            return new Circle();

        else if("Rectangle".equalsIgnoreCase(shapeType))
            return new Rectangle();

        return null;

    }
}
