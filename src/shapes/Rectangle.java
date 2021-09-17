package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.length = width;
        this.width = width;
    }
//    protected int length;
//    protected int width;
////              this is necessary here
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
////          this is not necessary here on but is good for specificity. only necessary if the parameter is the same as           your property/variable above.
//    public int getArea() {
//        System.out.println("Rectangle class");
//        return this.length * this.width;
//    }
//
//    public int getPerimeter() {
//        System.out.println("Rectangle class");
//        return (2 * this.length) + (2 * this.width);
//    }
//
//    public int getLength() {
//        return this.length;
//    }
//
//    public int getWidth() {
//        return this.width;
//    }
//
//    public Rectangle() {
//
//    }

}
