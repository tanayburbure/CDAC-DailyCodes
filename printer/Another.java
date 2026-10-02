package printer;

public class Another {
	public void createPrinter() {
		Printer p1 = new Printer() {
			@Override
			public void printMessage() {
				System.out.println("Hello from the anonymous printer class");
			}
		};
		p1.printMessage();
	}
}
