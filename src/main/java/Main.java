public class Main {
	public static void main(String[] args) {
	/*BankAccount acct1 = new BankAccount(3000, -1000);
        System.out.println(acct1.getBalance());
        boolean success = acct1.withdraw(1500);
        System.out.println("success=" + success + ", balance=" + acct1.getBalance());
        acct1.deposit(500);
        System.out.println("balance=" + acct1.getBalance());
        BankAccount acct2 = new BankAccount(3000, -1000);
        boolean success = acct1.transfer(acct2, 500);
        System.out.println("transfer success = " + success);
        System.out.println("balance=" + acct2.getBalance());*/
	BankAccount Lisa = new BankAccount(1000,-1000,"Lisa");
	BankAccount Bob = new BankAccount(1000,-1000,"Bob");
	System.out.println(Lisa.toString());
	System.out.println(Bob.toString());
	boolean success = Lisa.transfer(Bob, 500);
	System.out.println(Lisa.toString());
	System.out.println(Bob.toString());
        System.out.println("transfer success = " + success);
        success = Lisa.transfer(Bob, 1600);
        System.out.println("transfer success = " + success);
	}

}
