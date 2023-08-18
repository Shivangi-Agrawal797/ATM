package Library;

public class StudentMember extends LibraryMember{
	public StudentMember(int memberId, String memberName) {
		super(memberId, memberName);
	}

	void borrowItem(LibraryItem Item) {
		System.out.println("Book");
	}


}
