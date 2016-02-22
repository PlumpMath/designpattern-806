package pattern.strategy.thirdexample;

/**
 * Created by gauravs on 22/2/16.
 */
public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing vlc file: "+fileName);
    }

}
