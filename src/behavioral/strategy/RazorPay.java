package behavioral.strategy;

public class RazorPay implements PaymentService {

    @Override
    public boolean pay(double amount) {
        System.out.println("Paid using razorpay");
        return true;
    }
}
