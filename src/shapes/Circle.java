package shapes;
import java.util.Scanner;
public class Circle {
    private double radius;

    public static Scanner sc = new Scanner(System.in);

    public double getArea() {
        return Math.PI * (Math.pow(radius, 2));
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
