package forloop;

public class print_sumof_1to50_evennos {
	
	public static void main(String[] args) {
		int sum = 0;
		for(int i=0 ; i<=50; i++) {
			if(i % 2 == 0) {
				sum = sum +i;
				
			}
		}
		
		System.out.println("sum of all even nos from 1 to 50 is  " + sum);
	}

}
