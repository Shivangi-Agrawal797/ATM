package student;

public class Student {
	
	private int studentId;
	private String name;
	private static int totalStudents = 0;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public static int getTotalStudents() {
		return totalStudents;
	}
	public static void setTotalStudents(int totalStudents) {
		Student.totalStudents = totalStudents;
	}
	
	public Student(int studentId , String name) {
		super();
		this.name = name;
		this.studentId = studentId;
	}
	
	public void enrollStudent(Student student) {
		int st = Student.getTotalStudents();
		
		Student.setTotalStudents(++st);
		
	}
	
	public void dropStudent(Student student) {
		
		int st = Student.getTotalStudents();
		
		Student.setTotalStudents(--st);
		student = null;
	}
	

}
