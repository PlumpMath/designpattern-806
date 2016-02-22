package pattern.command.youtube;

/**
 * Created by gauravs on 19/2/16.
 */

/**
 * This is known as the invoker.
 * It has a method press() that when executed causes the execute method of command to be called.
 */
public class DeviceButton {
    Command command;

    public DeviceButton(Command command)
    {
        this.command=command;
    }

    public void press()
    {
        command.execute();
    }
    public void pressUndo()
    {
        command.undo();
    }
}
