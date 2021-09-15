package vehicles;

public class CarYardTest {
    public static void main(String[] args) {
        Vehicle bolt = new Bolt();
        bolt.setName("Chevy Bolt");
        Vehicle moped = new Moped();
        moped.setName("Moped");
        Vehicle car = new Car();
        car.setName("Zoomer");

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = bolt;
        vehicles[1] = moped;
        vehicles[2] = car;

        Vehicle valet = new Vehicle();


    }
}
