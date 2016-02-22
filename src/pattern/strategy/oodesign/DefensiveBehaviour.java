package pattern.strategy.oodesign;

/**
 * Created by gauravs on 21/2/16.
 */
public class DefensiveBehaviour implements IBehaviour {
    @Override
    public int moveCommand() {
        System.out.println("\tDefensive Behaviour: if find another robot run from it");
        return -1;
    }
}
