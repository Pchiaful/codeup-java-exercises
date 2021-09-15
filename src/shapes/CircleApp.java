package shapes;
//
import util.Input;
//
public class CircleApp {
//    public static void main(String[] args) {
//        String prompt = "Enter the radius of your circle.";
//        Input input = new Input();
//        double radius = input.getDouble();
//        Circle circle = new Circle();
//        double area =  input.getArea();
//        double circumference = circle.getCircumference();
//        System.out.println(area, circumference);
//    }

//solution
public static void main(String[] args) {
//        String prompt = "Enter the radius of your circle:";
//        System.out.println(prompt);
        Input input = new Input();
        double radius = input.getDouble("Enter the radius of your circle:");
        Circle circle = new Circle(radius);
        double area = circle.getArea();
        double circumference = circle.getCircumference();
        System.out.printf("The area of your circle is %.2f and its circumference is %.2f%n", area, circumference);
    }
}
