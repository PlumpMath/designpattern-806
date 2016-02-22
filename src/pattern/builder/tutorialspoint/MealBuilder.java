package pattern.builder.tutorialspoint;

import java.security.PublicKey;

/**
 * Created by gauravs on 18/2/16.
 */
public class MealBuilder {

    public Meal prepareVegMeal()
    {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal()
    {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
