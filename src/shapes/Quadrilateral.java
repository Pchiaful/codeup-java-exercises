package shapes;

abstract public class Quadrilateral extends Shape implements Measurable{
    protected int length;
    protected int width;

    public Quadrilateral(int length, int width) {

    }

    public int getLength() {
        return length;
    }

    public abstract void setLength(int length);

    public int getWidth() {
        return width;
    }

    public abstract void setWidth(int width);

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
