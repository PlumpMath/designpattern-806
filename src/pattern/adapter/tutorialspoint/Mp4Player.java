package pattern.adapter.tutorialspoint;

/**
 * Created by gauravs on 22/2/16.
 */
public class Mp4Player implements AdvanceMediaPlayer {


    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
