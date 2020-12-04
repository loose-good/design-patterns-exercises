package p9;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Point implements Exportable {
    private int x, y;

    @Override
    public String export(Formatter formatter) {
        if (formatter instanceof PointFormatter)
            return ((PointFormatter) formatter).format(this);
        else
           throw new UnsupportedOperationException();
    }
}
