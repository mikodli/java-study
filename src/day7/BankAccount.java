package day7;

public class BankAccount {
	
	/*
	조건
	balance는 외부에서 직접 변경 불가
	deposit(int money)로 입금
	money <= 0이면 입금하지 않음
	getBalance()로 현재 잔액 조회
	 */
	
	private int balance;
	
	void deposit(int money) {
		if(money > 0) {
			balance += money;
		}
	}

	int getBalance() {
		return balance;
	}
	
}
