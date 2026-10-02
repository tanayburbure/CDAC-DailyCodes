package multiinterface;

public class PaymentProcessor {
	public void processPayment(Payment payment, double amount) {
        System.out.println("Processing payment...");
        payment.pay(amount);
        System.out.println("Payment processed successfully.\n");
    }

}
