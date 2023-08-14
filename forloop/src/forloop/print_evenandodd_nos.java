package forloop;

public class print_evenandodd_nos {
	
	public static void main(String[] args) {
		int i ;
		
		System.out.println("even nos is ");
		for( i=0; i<=50; i++) {
			if(i % 2 == 0) {				System.out.println(i);
			}

		}
		
		System.out.println("odd nos is ");
		for( i=0; i<=50; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}

		}
	}

}
