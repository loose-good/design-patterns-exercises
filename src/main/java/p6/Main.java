package p6;

public class Main {

    public static void main(String[] args) {

        Tv tv = new Tv();
        MediaPlayer mp = new MediaPlayer();

        Button b1 = new Button(new TurnOnDevice(tv));
        Button b2 = new Button(new TurnOffDevice(tv));
        Button b3 = new Button(new TurnOnDevice(mp));
        Button b4 = new Button(new TurnOffDevice(mp));

        Button b5 = new Button(new CompositeButtonCommand(new TurnOnDevice(tv), new TurnOnDevice(mp)));
        Button b6 = new Button(new CompositeButtonCommand(new TurnOffDevice(tv), new TurnOffDevice(mp)));


        Remote remote = new Remote(new ButtonEntry(b1, b2), new ButtonEntry(b3, b4), new ButtonEntry(b5, b6));

        remote.getE3().pressButton1();

        remote.getE1().getButton2().setCommand(new TurnOnDevice(tv));

        remote.getE1().pressButton2();
    }
}
