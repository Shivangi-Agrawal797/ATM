import java.util.Arrays;
import java.util.Scanner;

public class Tic_tac_toe {
	
	static String[] board;
	static String winner;
	static String player;
	
	public static String whoIsWinner() {
		
		for(int i=0; i<8; i++) {
			
			String check = null;
			
			switch(i) {
			
			case 0: check = board[0] + board[1] + board[2];
			break;
			     
			case 1: check = board[3] + board[4] + board[5];
	        break;
	        
			case 2: check = board[6] + board[7] + board[8];
	        break;
	        
			case 3: check = board[0] + board[3] + board[6];
	        break;
	        
			case 4: check = board[1] + board[4] + board[7];
	        break;
	        
			case 5: check = board[2] + board[5] + board[8];
	        break;
	        
			case 6: check = board[0] + board[4] + board[8];
	        break;
	        
			case 7: check = board[2] + board[4] + board[6];
	        break;
	        
			}
			
			if(check.equals("xxx"))
				return "x";                                        // for for loop
			
			else if (check.equals("000"))
			return "0";
		}
		
		for(int i=0; i<9; i++) {
			if(Arrays.asList(board).contains(String.valueOf(i+1)))
				break;
			else if (i== 8)                                                            // for method
				return "Tie";
		    }
		
		System.out.println("it's  " + player + "  chance:");
		return null;
	}
	
	public static void showBoard() {
		
		System.out.println("***************************");
		System.out.println("|" + board[0] + "|" + board[1] + "|" + board[2] + "|");
		System.out.println("|" + board[3] + "|" + board[4] + "|" + board[5] + "|");
		System.out.println("|" + board[6] + "|" + board[7] + "|" + board[8] + "|");
		System.out.println("***************************");

	            }
	
	public static void main(String [] args) {
		
		winner = null;
		player = "x";
		board = new String[9];
		
		for (int i=0; i<9; i++) {
			
			board[i] = String.valueOf(i+1);
		}
		
		showBoard();
		
		System.out.println("it's  x  chance");
		Scanner sc =  new Scanner(System.in);
		System.out.println("***************************");

		
		while(winner == null) {
			
			int input;
			input = sc.nextInt();
			
			if(input>0 && input<=9) {
				
				if(board[input-1].equals(String.valueOf(input))) {
					
					board[input-1] = player;
					
					showBoard();
					
					if(player == "x")
						player = "0";
					else
						player = "x";
					
					winner = whoIsWinner();
				}
				else {
					System.out.println("enter value in another slot as it's already taken");
				}
			}
		}
		
		if(winner == "Tie")
			System.out.println("it's a Tie!");
		else {
			System.out.println("congratulations    " + winner + "   wins!!!");
		}
	}
}
