package pattern.strategy.thirdexample;

/**
 * Created by gauravs on 22/2/16.
 */
public class Client {
    public static void main(String...args)
    {
        StrategyMediaPlayer player = new StrategyMediaPlayer();

        player.put(AudioType.MP4, new Mp4Player());
        player.put(AudioType.VLC, new VlcPlayer());

        player.play(AudioType.MP4, "myMP4File");
        player.play(AudioType.VLC, "myVLCFile");
    }
}
