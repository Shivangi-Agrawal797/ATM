package AbstrcationandInterface;

public class Triangle implements Shape{

	{
		System.out.println("Area and parameter for Triangle");
	}
	
	private float a;
	private float b;
	private float c;
	private float length;
	
	public Triangle(float a, float b, float c, float length) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.length = length;
	}
	
	public void calculateArea() {
		//float a = 0, b = 0 , c=0;
		double area = a+b+c ;
		
		if(a>0 && b > 0 && c>0)
			System.out.println("area of triangle is = " + area);
		else
			System.out.println("please enter right value of a,b and c");
	}
	
	
	public void calculateParameter() {
		//2*pi*r
		//float radius = 0;
		
		//float length =0, base =0;
		double parameter = (length * b)/2 ;
		
		if (length > 0 && b>0)
			System.out.println("parameter of triangle is = " + parameter);
		else
			System.out.println("please enter right value of lendth and base");
	}
	

}
