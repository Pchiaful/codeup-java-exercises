package shapes;

public class Square extends Quadrilateral{
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double setLength() {
        double side = length;
    }

    @Override
    public double setWidth() {
        double side = width;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    //    protected int side;
//
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    public int getSide() {
//        return side;
//    }
//
//    public void setSide(int side) {
//        this.side = side;
//    }
//
//    public int getArea(){
//        System.out.println("Coming from Square class");
//        return side^2;
//    }
//
//    public int getPerimeter() {
//        System.out.println("Coming from Square class");
//        return 4 * side;
//
//    }

}
