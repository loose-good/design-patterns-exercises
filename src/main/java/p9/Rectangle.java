package p9;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rectangle implements Exportable {
    private double height, width;

    @Override
    public String export(Formatter formatter) {
        if (formatter instanceof RectangleFormatter)
            return ((RectangleFormatter) formatter).format(this);
        throw new UnsupportedOperationException();
    }
}
