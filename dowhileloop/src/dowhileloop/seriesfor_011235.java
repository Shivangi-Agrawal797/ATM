package dowhileloop;

public class seriesfor_011235 {
	
	public static void main(String[] args) {
		 int  n1=0, n2 =1, n3 =0, i =2;
		 
		 System.out.print(n1 + " " + n2);
		do {
				n3 = n1 + n2;
				System.out.print (" " + n3 + " ");
				n1 = n2;
				n2 = n3;
			    ++i;
				
		}while(i<=10);
	}

}
