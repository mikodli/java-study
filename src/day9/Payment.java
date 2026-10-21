package day9;

interface Payment {

	void pay(int amount);
	
	default void printReceipt() {
		System.out.println("영수증을 출력합니다. ");
	}
	
	static void processPayment(Payment payment, int amount) {
		payment.pay(amount);
		
	}
	
}
