package AbstrcationandInterface;

public class CircleRectangleTriangle {
	
	public static void main(String[] args) {
		
		Circle circle = new Circle(5);
		circle.calculateArea();
		circle.calculateParameter();
		
		Rectangle rectangle = new Rectangle(6, 4);
		rectangle.calculateArea();
		rectangle.calculateParameter();
		
		Triangle triangle = new Triangle(2, 5, 5, 4);
		triangle.calculateArea();
		triangle.calculateParameter();
	}

}
