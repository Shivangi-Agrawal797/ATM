package Inheritance;

public class Employee {
	
	private int Id;
	private String name;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Employee(int Id , String name) {
		super();
		this.Id = Id;
		this.name = name;
		
		
	}
	
	
	public void display() {
		
	}
	
	
	

}
