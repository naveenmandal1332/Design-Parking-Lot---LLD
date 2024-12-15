import java.util.Random;

public class Main {

  public static void main(String[] args) {

    // Create Vehicle - Two Wheeler:
    Vehicle v1 = new Vehicle();
    v1.setRegistrationNumber("DL01-6789");
    v1.setVehicleType(VehicleType.TWO_WHEELER);

    Vehicle v2 = new Vehicle();
    v2.setRegistrationNumber("DL06-6089");
    v2.setVehicleType(VehicleType.TWO_WHEELER);

    // Create Vehicle - Four Wheeler:
    Vehicle v3 = new Vehicle();
    v3.setRegistrationNumber("HR01-6789");
    v3.setVehicleType(VehicleType.FOUR_WHEELER);

    Vehicle v4 = new Vehicle();
    v4.setRegistrationNumber("DL1RTC-2376");
    v4.setVehicleType(VehicleType.FOUR_WHEELER);

    // Create Parking:
    ParkingSpot p1 = new ParkingSpot(); // TW
    p1.setId(new Random().nextInt(100 - 10) + 10);
    p1.setVehicle(v1);
    p1.setPrice(50);

    ParkingSpot p2 = new ParkingSpot(); // Four
    p2.setId(new Random().nextInt(100 - 10) + 10);
    p2.setVehicle(v4);
    p2.setPrice(100);
  }
}