package shape;

public class Circle implements Colorful{
	private double radius ;
	private String color ;
	
	Circle(double radius,String color){
		this.radius = radius ;
		this.color = color;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing a circle of radius : "+radius);
	}

	@Override
	public double calculateArea() {
		return Math.PI*radius*radius;
	}

	@Override
	public void fillColor() {
		System.out.println("Filling circle with color : "+color);
	}

}
