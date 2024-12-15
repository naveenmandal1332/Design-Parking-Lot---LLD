public class ParkingSpot {
  int id;
  boolean isEmpty = false;
  Vehicle vehicle;
  double price;

  public boolean getIsEmpty() {
    return isEmpty;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public void parkVehicle() {
    this.isEmpty = true;
    System.out
        .println("Parking Spot Id: " + id + " | " + " Vehicle Number: " + vehicle.getRegistrationNumber() + " | "
            + "Successfully parked!");
  };

  public void removeVehicle() {
    this.isEmpty = false;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}