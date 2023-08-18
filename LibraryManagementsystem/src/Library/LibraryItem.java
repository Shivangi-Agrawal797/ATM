package Library;

public class LibraryItem {
	
	private String title;
	private int studentId;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public LibraryItem(int studentId, String title) {
		super();
		this.studentId = studentId;
		this.title = title;
	}

	public void displayInfo() {
		
		System.out.println("Information about the library item");
	}
}
