package vehicle;

public class Car implements Vehicle{
	@Override
	public void startEngine() {
		System.out.println("Engine has started....!");
	};
	
	public static void main(String[] args) {
		Vehicle v1 = new Car();
		v1.startEngine();
	}
	
}
