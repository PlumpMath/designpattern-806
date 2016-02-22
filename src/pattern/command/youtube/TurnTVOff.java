package pattern.command.youtube;

/**
 * Created by gauravs on 19/2/16.
 */
public class TurnTVOff implements Command {

    ElectronicDevice electronicDevice;

    public TurnTVOff(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.off();

    }

    @Override
    public void undo() {
        electronicDevice.on();

    }
}
