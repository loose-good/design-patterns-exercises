package p9;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Triangle implements Exportable {
    private Point point1, point2, point3;

    @Override
    public String export(Formatter formatter) {
        if (formatter instanceof TriangleFormatter)
            return ((TriangleFormatter) formatter).format(this);
        else throw new UnsupportedOperationException();
    }
}
