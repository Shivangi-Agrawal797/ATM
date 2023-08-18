package Library;

 abstract class LibraryMember implements Reservable{
	
	private int memberId;
	private String memberName;
	
	
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	
	
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public LibraryMember(int memberId, String memberName) {
		
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	abstract void borrowItem(LibraryItem Item);
	
	public void reserveItem(LibraryItem Item){
		System.out.println("reserve items..");
	}

}
