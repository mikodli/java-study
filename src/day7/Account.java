package day7;

public class Account {
	   	private int balance;
	    static int accountCount;
	    final int accountNumber;

	    Account(int accountNumber) {
	        this.accountNumber = accountNumber;
	        accountCount++;
	    }

	    public void deposit(int money) {
	        if (money > 0) {
	            balance += money;
	        }
	    }

	    public int getBalance() {
	        return balance;
	    }
	
}
