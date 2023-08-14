package whileloop;

public class series2 {
	public static void main(String[] args) {
		
		int n1 = 0, n2 =1 , n3, i = 0;
		
		System.out.print(n1 + " " + n2);
		
		while(i<=10) {
			
			n3 = n1 + n2;
			System.out.print(" " + n3 + " ");
			
			n1 = n2;
			n2 = n3;
			
			++i;
			
		}
	}

}
