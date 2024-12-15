import java.time.LocalDateTime;
import java.time.Duration;

public class HourlyPricingStrategy implements PricingStrategy {

  @Override
  public double calculatePrice(LocalDateTime dateTime, double cost) {
    LocalDateTime now = LocalDateTime.now();
    long hoursDifference = Duration.between(dateTime, now).toHours();
    return hoursDifference * cost;
  }

}