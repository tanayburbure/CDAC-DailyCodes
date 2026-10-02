package multiinterface;

public class CreditCardPayment implements Payment{
	private String cardNumber;
	
	CreditCardPayment(String cardNumber){
		this.cardNumber = cardNumber ;
	}
	
	@Override
	public void pay(double amount) {
		System.out.println("paid ₹ "+amount+" Using credit card number "+cardNumber);	
	}

}
