package forloop;

public class series_for_0_1_1_2_3_5 {

	//0 1 1 2 3 5 8 13 21 
	
	public static void main(String[] args) {
		int n1=0, n2=1, n3, i ; 
		
		System.out.print(n1+ " " + n2);
		for( i=2; i<=10; ++i) {
			
			n3 = n1 + n2;			
			System.out.print(" "+ n3);
			
			n1 = n2;
			n2 = n3;
		}
		
	}
}
