import java.time.LocalDateTime;

public class ExitGate {
  Ticket ticket;
  PricingStrategy pricingStrategy;

  public ExitGate(PricingStrategy pricingStrategy) {
    this.pricingStrategy = pricingStrategy;
  }

  public double costComputation() {
    LocalDateTime vehicleEntryTime = ticket.getEntryDateTime();
    ParkingSpot parkingSpot = ticket.getParkingSpot();
    double cost = parkingSpot.getPrice();

    double totalAmount = pricingStrategy.calculatePrice(vehicleEntryTime, cost);
    return totalAmount;
  }
}