import java.time.LocalDateTime;
import java.util.List;

public class EntranceGate {
  ParkingManagerFactory parkingManagerFactory;
  ParkingSpotManager parkingManager;

  public EntranceGate(Vehicle vehicle, List<ParkingSpot> parkingSpot) {
    parkingManager = parkingManagerFactory.getParkingManager(vehicle, parkingSpot);
  }

  // Find Parking Spot:
  public ParkingSpot findParkingSpace() {
    return parkingManager.findParkingSpot();
  }

  // Book Parking Spot:
  public void bookParkingSpot(ParkingSpot spot) {
    parkingManager.parkingVehicle(spot);
  }

  // Generate Ticket:
  public Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
    Ticket ticket = new Ticket();

    LocalDateTime dateTime = LocalDateTime.now();
    ticket.setEntryDateTime(dateTime);
    ticket.setVehicle(vehicle);
    ticket.setParkingSpot(parkingSpot);

    System.out.println("Ticket Generated Successfuylly!");
    return ticket;
  }
}