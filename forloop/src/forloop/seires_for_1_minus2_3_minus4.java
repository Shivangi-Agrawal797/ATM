package forloop;

public class seires_for_1_minus2_3_minus4 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0)
				System.out.print(-i + ",");
			else
				System.out.print(i + ",");
		}
	}

}
