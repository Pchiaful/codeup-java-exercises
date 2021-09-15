package vehicles;

public class Moped extends Vehicle{
    public void makeNoise() {
        System.out.println("Brr brr");
    }

    public void breakingDownNoise() {
        super.makeNoise();
        System.out.println("...Hiss hisssss");
    }
}
