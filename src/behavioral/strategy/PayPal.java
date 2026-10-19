package behavioral.strategy;

public class PayPal implements PaymentService {
    @Override
    public boolean pay(double amount) {
        System.out.println("paid using PayPal");
        return true;
    }
}
