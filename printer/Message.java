package printer;

public class Message {
	public static void main(String[] args) {
		Printer p1 = new Printer();
		p1.printMessage();
		
		Another a1 = new Another();
		a1.createPrinter();
	}
}
