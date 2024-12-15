import java.time.LocalDateTime;

public class Ticket {
  LocalDateTime entryDateTime;
  Vehicle vehicle;
  ParkingSpot parkingSpot;
  PricingStrategy pricingStrategy;

  public LocalDateTime getEntryDateTime() {
    return entryDateTime;
  }

  public void setEntryDateTime(LocalDateTime entryDateTime) {
    this.entryDateTime = entryDateTime;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public ParkingSpot getParkingSpot() {
    return parkingSpot;
  }

  public void setParkingSpot(ParkingSpot parkingSpot) {
    this.parkingSpot = parkingSpot;
  }

}