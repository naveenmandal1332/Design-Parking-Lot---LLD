# Design-Parking-Lot-LLD

## Rough - Flow:

- Enterance Gate(Vehicle Ticket) -> Parking Lot -> Exit(Payment)

## Objects

- Vehicle (vehicleType, VehicleNumber)
- Ticket (Entry Time, Parking Spot)
- Enterance Gate (Find Parking spot, Update parking spot, Generate Ticket)
- Parking Spot (id, iSEmpty, price, vehicle, type)
- Exit Gate (Cost Calculation, Payment, Update Parking Spot)
