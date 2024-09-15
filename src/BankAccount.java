public class BankAccount {
	 private int balance = 0;
	 private int minBalance = -5000;
	 private String owner;
	 public String getOwner() {
		 
	 }
	 public void setOwner (String name) {
		 owner = name;
	 }
	 public int getBalance() {
		 return balance;
	 }
	 
	 public void setBalance (int x) {
		 if (x>minBalance) {
			 balance =x;
		 }
	 }
	 public BankAccount(int balance, int minBalance, String owner) {
		 this.balance = balance;
		 this.minBalance = minBalance;
		 this.owner = owner;
	 }
	 public boolean withdraw(int amount) {
	        if (balance - amount < minBalance)
	            return false;
	        balance = balance - amount;
	        return true;
	 }

	 public void deposit(int amount) {
	        balance = balance + amount;
	 }
	 public boolean transfer (BankAccount target, int amount) {
		 if (withdraw(amount) == false) {
	         System.out.print("you dont have enough money ....   ");   
			 return false;
		 }
		 target.deposit(amount);
		 return true;

	 }
	 public String toString() {
		 return "balance of " + owner +": " + balance;
	 }
	 


	 
	 
	 
	 
}
