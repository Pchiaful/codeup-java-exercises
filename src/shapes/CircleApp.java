package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        String prompt = "Enter the radius of your circle.";
        Input input = new Input();
        double radius = input.getDouble();
        Circle circle = new Circle();
        double area =  input.getArea();
        double circumference = circle.getCircumference();
        System.out.println(area, circumference);



    }
}
