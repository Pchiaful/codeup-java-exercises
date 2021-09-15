package birds;

public class Duck extends Bird{
    //now a sub-class of Bird
    //overriding: when a subclass redefines one of its inherited methods
    public void makeNoise() {
        System.out.println("Quack quack");
    }

}
