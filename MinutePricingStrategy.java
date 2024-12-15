import java.time.LocalDateTime;
import java.time.Duration;

public class MinutePricingStrategy implements PricingStrategy {

  @Override
  public double calculatePrice(LocalDateTime dateTime, double cost) {
    LocalDateTime now = LocalDateTime.now();
    long hoursDifference = Duration.between(dateTime, now).toMinutes();
    return hoursDifference * cost;
  }

}