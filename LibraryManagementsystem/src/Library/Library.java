package Library;

public class Library {
	
	public static void main(String[] args) {
		
		LibraryItem libraryItem = new LibraryItem(0, null);
		
		Book book = new Book(101, "javabykiran");
		
		DVD dvd = new DVD(101, "javabykiran");
		
		libraryItem.displayInfo();
		book.displayInfo();
		dvd.displayInfo();
		
		FacultyMember facultyMember = new FacultyMember(40,"facultyMember");
		StudentMember studentMember = new StudentMember(10, "studentMember");
		
		facultyMember.borrowItem(libraryItem);
		studentMember.borrowItem(libraryItem);
		book.borrowItem(libraryItem);
		dvd.borrowItem(libraryItem);
		
		
	}

}
