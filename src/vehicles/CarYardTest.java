package vehicles;

public class CarYardTest {
    public static void main(String[] args) {
        Car bolt = new Car();
        bolt.setName("Chevy Bolt");
        Car moped = new Car();
        moped.setName("Moped");
        Car jeep = new Car();
        jeep.name = "Wrangler";

        Vehicle[] allTheCars = new Vehicle[3];
        vehicles[0] = bolt;
        vehicles[1] = moped;
        vehicles[2] = jeep;

        CarYard caryard = new CarYard();
        caryard.vehicles = allTheCars;
//        .alarmCascade();

//        Vehicle valet = new Vehicle();
//        vehicles.alarm


    }
}
