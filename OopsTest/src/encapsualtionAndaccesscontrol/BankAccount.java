package encapsualtionAndaccesscontrol;

public class BankAccount {
	
	private long accountnumber;
	private long balance;
	private String ownerName;
	
	
	public long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	
	
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public BankAccount(long accountnumber, long balance , String ownerName ) {
		super();
		this.accountnumber = accountnumber;
		this.balance = balance;
		this.ownerName = ownerName;
		
	}
	
	
	public void deposite(long amount) {
		
		if(amount > 0) {
			System.out.println("deposit success" + amount);
			long balance = this.getBalance(); // fetch the balance 
			balance = balance + amount;     // update balance
			this.setBalance(balance);
		}
		
	}
	
	public void withdraw(long amount) {
		if(balance>0 && balance>= amount) {
			System.out.println("withdraw success" + amount);
			long balance = this.getBalance();
			
			balance = balance - amount;
			this.setBalance(balance);
		}
		else 
			System.out.println("you can't withdraw this amount" + amount);
   
		
	}
	
	public void checkBalance() {
		
		System.out.println("your account details \n" + "account number = " + accountnumber + "\n your name = " + ownerName + "\n balance = " + balance);
	}
}
