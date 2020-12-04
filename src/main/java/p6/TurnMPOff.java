package p6;

public class TurnMPOff implements ButtonCommand {

    private MediaPlayer mediaPlayer;

    public TurnMPOff(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void action() {
        this.mediaPlayer.turnOff();
    }
}
