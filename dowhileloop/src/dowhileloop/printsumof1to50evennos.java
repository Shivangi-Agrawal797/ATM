package dowhileloop;

public class printsumof1to50evennos {

	public static void main(String[] args) {
		
		int sum = 0, i = 1;
		do {
			if(i % 2 ==0) {
				sum = sum + i;
			}
			i++;
		}while(i<=50);
		System.out.println(sum);
	}
}
