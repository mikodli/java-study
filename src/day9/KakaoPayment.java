package day9;

class KakaoPayment implements Payment{

	public void pay(int amount) {
		this.printReceipt(amount);
	}
	
	public void printReceipt(int amount) {
		System.out.println("카카오페이로 " + amount + "원 결제");
	}
		
}
