package pattern.factory;

/**
 * Created by gauravs on 15/2/16.
 */
public interface Shape {
    void draw();
}


class Rectangle implements Shape
{
    @Override
    public void draw() {
        System.out.println("Drown Rectangle");
    }
}

class Circle implements Shape
{
    public void draw()
    {
        System.out.println("Drown Circle");
    }
}