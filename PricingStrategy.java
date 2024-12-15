import java.time.LocalDateTime;

public interface PricingStrategy {
  public double calculatePrice(LocalDateTime date, double cost);
}