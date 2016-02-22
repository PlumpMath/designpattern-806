package pattern.command.youtube;

/**
 * Created by gauravs on 19/2/16.
 */
public interface Command {
    public void execute();
    public void undo();
}
