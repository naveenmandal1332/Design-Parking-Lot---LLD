import java.util.List;

public abstract class ParkingSpotManager {
  List<ParkingSpot> parkingSpots;

  public ParkingSpotManager(List<ParkingSpot> parkingSpots) {
    this.parkingSpots = parkingSpots;
  }

  public abstract ParkingSpot findParkingSpot();

  public abstract void addParkingSpot(Vehicle vehicle);

  public abstract void removeParkingSpot(int id);

  public abstract void parkingVehicle(ParkingSpot spot);

  public abstract void freeParkingSpot(ParkingSpot spot);

  public abstract void displaySpot();
}