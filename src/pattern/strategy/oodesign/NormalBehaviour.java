package pattern.strategy.oodesign;

/**
 * Created by gauravs on 21/2/16.
 */
public class NormalBehaviour implements IBehaviour {
    @Override
    public int moveCommand() {
        System.out.println("\tNormal Behaviour: if find another robot ignore it");
        return 0;
    }
}
