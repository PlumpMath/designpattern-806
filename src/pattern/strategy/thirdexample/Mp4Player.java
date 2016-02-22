package pattern.strategy.thirdexample;

/**
 * Created by gauravs on 22/2/16.
 */
public class Mp4Player implements AdvanceMediaPlayer {

    @Override
    public void play(String fileName) {
        System.out.println("Playing MP4 file with name: "+fileName);

    }
}
