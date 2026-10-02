package shape;

public class Show {

	public static void main(String[] args) {
		Colorful c1 = new Circle(5.00,"red");
		c1.draw();
		c1.fillColor();
		
		System.out.println("The area is : "+c1.calculateArea());
	}

}
