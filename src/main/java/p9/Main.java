package p9;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(new Point(3, 6), new Point(2, 7), new Point(-1, 10));
        Circle circle1 = new Circle(new Point(0, 0), 10);
        Circle circle2 = new Circle(new Point(-4, 2), 20);
        Rectangle rectangle = new Rectangle(10, 20);

        XmlFormatter xmlFormatter = new XmlFormatter();
        System.out.println(triangle.export(xmlFormatter));
        System.out.println(circle1.export(xmlFormatter));
        System.out.println(circle2.export(xmlFormatter));
        System.out.println(rectangle.export(xmlFormatter));
    }
}
