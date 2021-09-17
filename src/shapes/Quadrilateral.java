package shapes;

abstract public class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {

    }

    public double getLength() {
        return length;
    }

    public abstract void setLength(double length);

    public double getWidth() {
        return width;
    }

    public abstract void setWidth(double width);

    @Override
    public double getPerimeter() {
        return ((2 * this.length) + (2 * this.width));
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
}
