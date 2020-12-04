package p6;

public class TurnTvOn implements ButtonCommand {

    private Tv tv;

    public TurnTvOn(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void action() {
        tv.turnOn();
    }
}
