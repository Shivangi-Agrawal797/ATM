package Inheritance;

public class Manager extends Employee{
	
	public Manager(int Id, String name) {
		super(Id, name);
	}

	private String department = "electronics";

	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	

    public void display() {
    	
    	System.out.println(" user name is  = " + getName() + "\n user id is = " + getId() + "\n user depaertmemnt is = " + getDepartment()) ;
		
	}
}
