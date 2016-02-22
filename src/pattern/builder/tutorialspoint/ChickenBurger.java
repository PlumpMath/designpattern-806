package pattern.builder.tutorialspoint;

/**
 * Created by gauravs on 18/2/16.
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Checken Burger";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
