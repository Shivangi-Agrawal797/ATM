package encapsualtionAndaccesscontrol;

public class Bank {
	
	public static void main(String[] args) {
		 
		BankAccount bankAccount1 = new BankAccount(145453, 40000, "shivangi");
		//bankAccount1.checkBalance();
        System.out.println();
		
		bankAccount1.deposite(10000);
		bankAccount1.checkBalance();
		System.out.println();
		
		bankAccount1.withdraw(5000);
		bankAccount1.checkBalance();
		System.out.println();
	}
	

}
