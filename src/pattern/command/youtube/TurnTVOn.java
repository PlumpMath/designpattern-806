package pattern.command.youtube;

/**
 * Created by gauravs on 19/2/16.
 */
public class TurnTVOn implements Command {

    ElectronicDevice electronicDevice ;

    public TurnTVOn(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.on();

    }

    @Override
    public void undo() {
        electronicDevice.off();

    }
}
