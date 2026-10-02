package multiinterface;

public class PaypalPayment implements Payment{
	private String email;
	
	PaypalPayment(String email){
		this.email = email;
	}

	@Override
	public void pay(double amount) {
		System.out.println("paid ₹ "+amount+" Using Paypal account "+email);	
	}

}
