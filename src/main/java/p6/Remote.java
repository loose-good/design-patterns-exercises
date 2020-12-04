package p6;

import lombok.Data;

@Data
public class Remote {

    private ButtonEntry e1, e2, e3;

    public Remote(ButtonEntry e1, ButtonEntry e2, ButtonEntry e3) {
        this.e1 = e1;
        this.e2 = e2;
        this.e3 = e3;
    }
}
