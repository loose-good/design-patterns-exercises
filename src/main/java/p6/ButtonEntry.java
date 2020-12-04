package p6;

import lombok.Data;

@Data
public class ButtonEntry {

    private Button button1, button2;

    public ButtonEntry(Button button1, Button button2) {
        this.button1 = button1;
        this.button2 = button2;
    }

    public void pressButton1() {
        button1.action();
    }

    public void pressButton2() {
        button2.action();
    }
}
