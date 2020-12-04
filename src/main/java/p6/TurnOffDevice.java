package p6;

public class TurnOffDevice implements ButtonCommand {

    private Device device;

    public TurnOffDevice(Device device) {
        this.device = device;
    }

    @Override
    public void action() {
        device.turnOff();
    }
}
