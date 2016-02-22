package pattern.strategy.tutorialpoints;

/**
 * Created by gauravs on 21/2/16.
 */
public class OperationSum implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1+num2;
    }
}
