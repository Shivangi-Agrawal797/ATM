package dowhileloop;

public class seriesfor1minus23minus4 {
	
	public static void main(String[] args) {
		int i=0;
		do {
			if(i%2 == 0)
				System.out.print(-i + " ");
			else
				System.out.print(i + " ");
			
			i++;
		}while(i<=20);
		
	}

}


