package p6;

public class TurnTvOff implements ButtonCommand {

    private Tv tv;

    public TurnTvOff(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void action() {
        tv.turnOff();
    }
}
