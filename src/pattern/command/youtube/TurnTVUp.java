package pattern.command.youtube;

/**
 * Created by gauravs on 19/2/16.
 */
public class TurnTVUp implements Command {

    ElectronicDevice electronicDevice;

    public TurnTVUp(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.volumeUp();

    }

    @Override
    public void undo() {
        electronicDevice.volumeDown();

    }
}
