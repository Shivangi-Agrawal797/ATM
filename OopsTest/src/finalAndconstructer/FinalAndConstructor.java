package finalAndconstructer;

public class FinalAndConstructor {
	
	public FinalAndConstructor() {
		System.out.println("you are using free version please upgrade");
	}

	public FinalAndConstructor(Transection transection) {
		
		if(transection != null)
			System.out.println("your product key is = " + transection.productKey + "\n enoy your plan");
	
		else 
			System.out.println("transection is not done yet first activate your product key");
	}
	
	public static void main(String[] args) {
		
		Transection transection = new Transection();
		FinalAndConstructor f1 = new FinalAndConstructor(transection);
	}
}
