package greeting;

public class GenerateGreeting {
	public void generateGreeting() {
		Greeting g = new Greeting() {
			@Override
			public void sayHello(){
				System.out.println("hey... from the anonymous class");
			}
		};
		g.sayHello();
	}
}
