package pattern.command.youtube;

/**
 * Created by gauravs on 19/2/16.
 */
public class TVRemote {

    public static ElectronicDevice getDevice(){

        return new Television();

    }

}