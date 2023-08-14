package dowhileloop;

public class countofoddnos_1to25 {
	
	public static void main(String[] args) {
		int i =1, count = 0;
		do {
			
			if(i % 2 != 0) {
				count++;
			}
			i++;
			
		}while(i <= 25);
		System.out.println(count);
	}

}
