package inheritanceAndpolymorphism;

public class Animal {
	
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal(String name, int age ) {
		this.setName(name);
	    this.setAge(age);
		
	}
	
	 public void makeSound() {
		 System.out.println(" sounds from animal ");
	 }
}
