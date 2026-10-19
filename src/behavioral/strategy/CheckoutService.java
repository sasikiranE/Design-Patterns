package behavioral.strategy;

public class CheckoutService {

    private final PaymentService paymentService;

    public CheckoutService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void checkout(double amount) {
        if (paymentService.pay(amount)) {
            System.out.println("TRANSACTION SUCCESSFUL");
        } else {
            System.out.println("TRANSACTION FAILED");
        }
    }
}
