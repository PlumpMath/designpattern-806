package pattern.strategy.tutorialpoints;

/**
 * Created by gauravs on 21/2/16.
 */
public class StrategyPatternDemo {
    public static void main(String args[])
    {
        Strategy strategy = new OperationSum();
        Strategy strategy1 = new OperationMultiply();
        Strategy strategy2=new OperationSubstract();
        Context context = new Context(strategy2);
        System.out.println(context.executeStrategy(1, 2));
    }
}
