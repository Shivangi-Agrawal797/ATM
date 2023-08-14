package dowhileloop;

public class printcountofevennosfrom0to50 {
	public static void main(String[] args) {
		
		int count = 0, i = 1;
		do {
			if(i % 2 == 0) {
				count++;
				
			}i++;
		}while(i<=50);
		System.out.println(count);
	}

}
