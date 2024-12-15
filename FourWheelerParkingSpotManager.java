import java.util.List;
import java.util.Random;

public class FourWheelerParkingSpotManager extends ParkingSpotManager {
  public FourWheelerParkingSpotManager(List<ParkingSpot> parkingSpots) {
    super(parkingSpots);
  }

  @Override
  public ParkingSpot findParkingSpot() {
    for (ParkingSpot spot : parkingSpots) {
      if (spot.getIsEmpty())
        return spot;
    }
    return null;
  };

  @Override
  public void addParkingSpot(Vehicle vehicle) {
    ParkingSpot spot = new ParkingSpot();
    int spotId = new Random().nextInt(100 - 10) + 10;

    spot.setId(spotId);
    spot.setVehicle(vehicle);
    spot.setPrice(100);

    parkingSpots.add(spot);
  }

  @Override
  public void removeParkingSpot(int id) {
    for (ParkingSpot spot : parkingSpots) {
      if (spot.getId() == id) {
        parkingSpots.remove(spot);
        break;
      }
    }

    System.out.println("Successfully remove the parking spot with the id: " + id);
  }

  public void parkingVehicle(ParkingSpot spot) {
    spot.parkVehicle();
    System.out
        .println("Successfully Parked Vehicle: " +
            spot.getVehicle().getRegistrationNumber() +
            " At: " + spot.getId());
  }

  public void freeParkingSpot(ParkingSpot spot) {
    spot.removeVehicle();
    System.out
        .println("Successfully Free the Parking space: " + spot.getId());
  }

  @Override
  public void displaySpot() {
    for (ParkingSpot spot : parkingSpots) {
      System.out.println("Four Wheeler Section :: " + "Spot Id: " + spot.getId() + " | " + "Is Available: "
          + spot.getIsEmpty() + " | " + "Price: "
          + spot.getPrice());
    }
  }

}