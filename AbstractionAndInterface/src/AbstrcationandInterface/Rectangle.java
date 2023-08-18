package AbstrcationandInterface;

public class Rectangle implements Shape {
	{
		System.out.println("Area and parameter for Ractangle");
	}
	
	float length =0, width =0;
	
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
		
	}
	public void calculateArea() {
		//float length = 0, width = 0;
		double area = length * width ;
		
		if(length>0 && width > 0)
			System.out.println("area of rectangle is = " + area);
		else
			System.out.println("please enter right value of length and width");
	}
	
	
	public void calculateParameter() {
		//2*pi*r
		//float radius = 0;
		
		
		double parameter = 2 * (length+width);
		
		if (length > 0 && width>0)
			System.out.println("parameter of rectangle is = " + parameter);
		else
			System.out.println("please enter right value of lendth and width");
	}

	
}

