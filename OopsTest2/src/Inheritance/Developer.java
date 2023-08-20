package Inheritance;

public class Developer extends Employee {

	public Developer(int Id, String name) {
		super(Id, name);
	}

	private String programmingLanguage = "java";
	

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	
public void display() {
    	
    	System.out.println(" user name is  = " + getName() + "\n user id is = " + getId() + "\n user language is = " + getProgrammingLanguage()) ;
		
	}
}
