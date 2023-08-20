package Constructors;

public class Student {
	
	private String name;
	private int age;
	private int studentId;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public Student(String name, int age , int studentId) {
		super();
		this.age = age;
		this.name = name;
		this.studentId = studentId ;
		
	}
	
	public void info() {
		System.out.println("student name is = " + getName() + "\n student age is = " + getAge() + "\n student id is = " + getStudentId());
	}

}
