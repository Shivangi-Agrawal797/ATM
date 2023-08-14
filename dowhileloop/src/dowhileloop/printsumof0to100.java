package dowhileloop;

public class printsumof0to100 {
	
	public static void main(String[] args) {
		
		int sum = 0,i =0;
		do {
			sum = sum +i;
			i++;
		}while(i<=100);
		System.out.println(sum);
	}

}
