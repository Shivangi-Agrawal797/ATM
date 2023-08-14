package vowels;

	import java.util.Scanner;

	public class allvowelspresentinastring {
		 static int checkIfAllVowels(String str) {

	    int []vowel = new int[10];

	    for (int i = 0; i < str.length(); i++)
	    {
	        if (str.charAt(i) == 'A' || str.charAt(i) == 'a')
	      vowel[0] = 1;

	  else if (str.charAt(i) == 'E' || str.charAt(i) == 'e')
	      vowel[1] = 1;

	  else if (str.charAt(i) == 'I' || str.charAt(i) == 'i')
	      vowel[2] = 1;

	  else if (str.charAt(i) == 'O' || str.charAt(i) == 'o')
	      vowel[3] = 1;

	  else if (str.charAt(i) == 'U' || str.charAt(i) == 'u')
	      vowel[4] = 1;
	}
	    
	    for (int  i = 0; i < 5; i++)
	    {
	        if (vowel[i] == 0)
	        {
	            return 1;
	        }
	    }
	    return 0;
	}
		static void checkIfAllVowelsArePresent(String str)
		{
		 
		    if (checkIfAllVowels(str) == 1)
		        System.out.print("String does not contain all vowels");
		    else
		        System.out.print(str);
		}
	    public static void main(String args[]) {
	    	Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();
	        checkIfAllVowelsArePresent(str);
	    sc.close();
	    }
	    

}
