package AbstrcationandInterface;

public class Circle implements Shape {
	
	{
		System.out.println("Area and parameter for circle");
	}
	
	private float radius;
	
	public Circle(float radius) {
		this.radius = radius;
		
	}

	public void calculateArea() {
		//float radius=0;
		double area = Math.PI * radius * radius ;
		
		if(radius>0)
			System.out.println("area of circle is = " + area);
		else
			System.out.println("please enter right value of radius");
	}
	
	
	public void calculateParameter() {
		//2*pi*r
		//float radius = 0;
		double parameter = 2 * Math.PI * radius ;
		
		if (radius > 0)
			System.out.println("parameter of circle is = " + parameter);
		else
			System.out.println("please enter right value of radius");
	}


	

	
}
