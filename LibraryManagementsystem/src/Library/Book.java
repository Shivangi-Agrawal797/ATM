package Library;

public class Book extends LibraryItem{
	
	public Book(int studentId, String title) {
		super(studentId, title);
		
	}

	
	private String authorName = "kiran";

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
     public void displayInfo() {
		
		System.out.println("Book title is = " + getTitle()+ "\nauthor name is= " + authorName+ "\nstudentId is = " + getStudentId());
		
	}
	
     void borrowItem(LibraryItem Item) {
    	 System.out.println("");
	}
}