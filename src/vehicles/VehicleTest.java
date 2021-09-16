package vehicles;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle bolt = new Vehicle();
        bolt.setName("Chevy Bolt");
        System.out.println(bolt.getName() + " goes:");
        bolt.makeNoise();
        System.out.println("Except evs dont make noise hue hue hue.");

        Moped moped = new Moped();
        moped.setName("Vespa");
        System.out.println(moped.getName() + " goes:");
        moped.makeNoise();
        moped.breakingDownNoise();

        Car car = new Car("Focus");
//        car.setName("Focus");
        car.makeNoise();
        System.out.println(car.getName());

        Jeep wrangler = new Jeep();
        wrangler.setName("Wrangler");
        System.out.println(wrangler.getName() + " goes:");
        wrangler.makeNoise();

    }
}
