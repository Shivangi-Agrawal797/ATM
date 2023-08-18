package student;

public class StudentDriver {
	
	public static void main(String[] args) {
		
		Student student = new Student(101, "sateesh");
		
		student.enrollStudent(student);
		System.out.println("total student enrolled " + Student.getTotalStudents());
		
		
		student.dropStudent(student);
		System.out.println("total student dropped  " + Student.getTotalStudents() );
	}

}
