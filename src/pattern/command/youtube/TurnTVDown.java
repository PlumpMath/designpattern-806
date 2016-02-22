package pattern.command.youtube;

/**
 * Created by gauravs on 19/2/16.
 */
public class TurnTVDown implements Command{

    ElectronicDevice electronicDevice;

    public TurnTVDown(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.volumeDown();

    }

    @Override
    public void undo() {
        electronicDevice.volumeUp();

    }
}
