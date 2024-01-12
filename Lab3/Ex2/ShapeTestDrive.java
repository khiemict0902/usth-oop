import ex1.Object;
import ex1.Shape;
import ex1.Point;
import ex1.Circle;
import ex1.Cylinder;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Point(0, 0);
        shapes[1] = new Circle(0, 0, 1);
        shapes[2] = new Cylinder(0, 0, 1, 2);

        for (Shape shape : shapes) {
            System.out.println("Name: " + shape.getName());
            System.out.println("Area: " + shape.calArea());
            System.out.println("Volume: " + shape.calVolume());
            System.out.println();
        }
    }
}
