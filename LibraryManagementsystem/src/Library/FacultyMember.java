package Library;

public class FacultyMember extends LibraryMember {

	public FacultyMember(int memberId, String memberName) {
		super(memberId, memberName);
	}

	void borrowItem(LibraryItem Item) {
		System.out.println("borrow item is book");
	}
	

}
