package day9;

class CardPayment implements Payment{
	
	public void pay(int amount) {
		
		this.printReceipt(amount);
	}

	public void printReceipt(int amount) {
		System.out.println("카드로 " + amount + "원 결제");
	}
	
	void cardOnly() {
		System.out.println("카드 전용");
	}
	
}
