package Library;

public class DVD extends LibraryItem {

	public DVD(int studentId, String title) {
		super(studentId, title);
	}
	
	private float duration = (float) 20.00;
	
	public float getDuration() {
		return duration;
	}


	public void setDuration(float duration) {
		this.duration = duration;
	}
	
       public void displayInfo() {
		
		System.out.println("Book title is = " + getTitle()+ "\nduration is= " + duration+ "\nstudentId is = " + getStudentId());
		
	}
       
       void borrowItem(LibraryItem Item) {
    	   
    	   System.out.println("");
      	 
   	}
}
