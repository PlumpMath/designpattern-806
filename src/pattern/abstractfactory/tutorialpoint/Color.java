package pattern.abstractfactory.tutorialpoint;

/**
 * Created by gauravs on 17/2/16.
 */
public interface Color {
    void fill();
}

class Red implements Color {
    @Override
    public void fill()
    {
        System.out.println("Inside Red::fill() method.");
    }
}
class Green implements Color {

    @Override
    public void fill()
    {
        System.out.println("Inside Green::fill() method.");

    }
}

class Blue implements Color {
    @Override
    public void fill()
    {
        System.out.println("Inside Blue::fill() method");
    }
}
