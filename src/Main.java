import behavioral.strategy.CheckoutService;
import behavioral.strategy.PayPal;
import behavioral.strategy.RazorPay;
import behavioral.strategy.Stripe;

public class Main {
    public static void main(String[] args) {
        CheckoutService checkoutService = new CheckoutService(new Stripe());
        checkoutService.checkout(5000);
    }
}