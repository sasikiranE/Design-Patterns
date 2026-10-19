package behavioral.strategy;

public class Stripe implements PaymentService {
    @Override
    public boolean pay(double amount) {
        System.out.println("paid using Stripe");
        return true;
    }
}
