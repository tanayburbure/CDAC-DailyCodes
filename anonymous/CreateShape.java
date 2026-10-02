package anonymous;

public class CreateShape {
	public void shapegen() {
		Shape s = new Shape() {
			@Override
			void draw() {
				System.out.println("Drawing a shape using anonymous class...");
			}
			
		};
		s.draw();
	}
}
