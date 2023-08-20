package Inheritance;

public class Info {
	
	public static void main(String[] args) {
		
		System.out.println("information of the user");
		
		
	    System.out.println("user is Manager");
		Manager manager = new Manager(45,"shivangi");
		manager.display();
		
		System.out.println("user is developer");
		Developer developer = new Developer(56, "agrawal");
		developer.display();
		
		
	}

}
