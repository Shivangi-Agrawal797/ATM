package dowhileloop;

public class seriesof_10203040 {
	// 10 20 30 40 50
	
	public static void main(String[] args) {
		int i= 1, res = 0;
		do {
			res = 10 * i;
			System.out.print(res + " ");
			i++;
		}while(i<=10);
	}

}
