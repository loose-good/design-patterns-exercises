package p6;

public class Button {

    private ButtonCommand command;

    public Button(ButtonCommand command) {
        this.command = command;
    }

    public void setCommand(ButtonCommand command) {
        this.command = command;
    }

    public void action() {
        command.action();
    }
}
