package vehicles;

public class CarYard {
    Vehicle[] vehicles;

    public void alarmCascade(Vehicle[] parkedVehicle) {
        for(Vehicle vehicles: parkedVehicle) {
            System.out.println(vehicles.getName() + " goes ");
            vehicles.makeNoise();
        }
    }

//    publice Vehicle findVehicle(String name, Vehicle[] vehicles) {
//        for(Vehicle vehicle: vehicles){
//            if (vehicle.getName().equalsIgnoreCase()){
//                return vehicle;
//            }
//        }
//        Vehicle notHere = new Vehicle();
//        return notHere;
//    }
}

//Create a Car class if you have not already done so. It should be a subclass of Vehicle. Create a Garage class with two properties. It should have a Vehicle array called vehicles, and an alarmCascade() method that simulates all the vehicles in the array having their alarms go off in sequence. Create a GarageTest class. Create at least three cars and set their names. Put them in an array of vehicles. Instantiate a garage, assign your array to the garage's vehicles property and run the alarmCascade method. Now replace one of the cars with another type of vehicle. Run the alarmCascade method again and note that the vehicles array is polymorphic and can contain different types of vehicles.