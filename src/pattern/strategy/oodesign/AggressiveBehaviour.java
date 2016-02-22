package pattern.strategy.oodesign;

/**
 * Created by gauravs on 21/2/16.
 */
public class AggressiveBehaviour implements IBehaviour {
    @Override
    public int moveCommand() {
        System.out.println("\tAgressive Behaviour: if find another robot attack it");
        return 1;
    }
}
