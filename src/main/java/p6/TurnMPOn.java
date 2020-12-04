package p6;

public class TurnMPOn implements ButtonCommand {

    private MediaPlayer mediaPlayer;

    public TurnMPOn(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void action() {
        mediaPlayer.turnOn();
    }
}
