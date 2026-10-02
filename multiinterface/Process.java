package multiinterface;

public class Process {

	public static void main(String[] args) {
		PaymentProcessor p = new PaymentProcessor();
		
		Payment cc = new CreditCardPayment("42525617728");
		Payment pp = new PaypalPayment("yourpayment@123.com");
		
		p.processPayment(cc,4000);
		p.processPayment(pp, 4400);

	}

}
