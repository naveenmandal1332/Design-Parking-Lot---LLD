import java.util.List;

public class ParkingManagerFactory {

  public ParkingSpotManager getParkingManager(Vehicle vehicle, List<ParkingSpot> parkingSpot) {
    if (vehicle.getVehicleType() == VehicleType.TWO_WHEELER) {
      return new TwoWheelerParkingSpotManager(parkingSpot);
    }

    if (vehicle.getVehicleType() == VehicleType.FOUR_WHEELER) {
      return new FourWheelerParkingSpotManager(parkingSpot);
    }

    System.out.println("Invalid Vehicle Type!");
    return null;
  }
}