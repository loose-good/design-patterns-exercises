package p6;

public class TurnOnDevice implements ButtonCommand {

    private Device device;

    public TurnOnDevice(Device device) {
        this.device = device;
    }

    @Override
    public void action() {
        device.turnOn();
    }
}
