package pattern.builder.tutorialspoint;

/**
 * Created by gauravs on 18/2/16.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
