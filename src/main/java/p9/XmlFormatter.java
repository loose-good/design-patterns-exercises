package p9;

public class XmlFormatter implements PointFormatter, CircleFormatter, TriangleFormatter, RectangleFormatter {
    @Override
    public String format(Circle c) {
        return "<circle>\n" +
                "\t<radius>" + c.getRadius() + "</radius>\n" +
                "\t<center>\n" +
                format(c.getCenter()) +
                "\t</center>\n" +
                "</circle>";
    }

    @Override
    public String format(Point p) {
        return "\t<point>\n" +
                "\t\t<x>" + p.getX() + "</x>\n" +
                " \t\t<y>" + p.getY() + "</y>\n" +
                "\t</point>\n";
    }

    @Override
    public String format(Triangle triangle) {
        return "<triangle>\n" +
                "\t<points>\n" +
                format(triangle.getPoint1()) +
                format(triangle.getPoint2()) +
                format(triangle.getPoint3()) +
                "\t</points>\n" +
                "</triangle>";
    }

    @Override
    public String format(Rectangle rectangle) {
        return "<rectangle>\n" +
                "\t<width>" + rectangle.getWidth() + "</width>\n" +
                "\t<height>" + rectangle.getHeight() + "</height>\n" +
                "</rectangle>\n";
    }
}
