package pattern.strategy.thirdexample;

import java.util.HashMap;

/**
 * Created by gauravs on 22/2/16.
 */
public class StrategyMediaPlayer {
    HashMap<AudioType, AdvanceMediaPlayer> players = new HashMap<>(4);
    public void put(AudioType audioType, AdvanceMediaPlayer advanceMediaPlayer)
    {

        players.put(audioType, advanceMediaPlayer);

    }


    public void play(AudioType audioType, String fileName) {
        players.get(audioType).play(fileName);

    }
}
