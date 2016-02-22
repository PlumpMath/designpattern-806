package pattern.abstractfactory.tutorialpoint;

/**
 * Created by gauravs on 17/2/16.
 */
public interface Shape {
    void draw();
}

class Rectangle implements Shape
{

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

class Square implements Shape{
    @Override
    public void draw()
    {
        System.out.println("Inside Square::draw() method.");
    }
}

class Circle implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("Inside Circle::draw() method.");
    }
}