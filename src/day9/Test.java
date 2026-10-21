package day9;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment.processPayment(new CardPayment(), 10000);
		Payment.processPayment(new KakaoPayment(), 20000);
	}
	
	/*
	
	1. Payment payment = new CardPayment();가 가능한 이유
	다형성 때문에 Payment 타입의 인터페이스를 매개변수로 넣었고 매개변수에 들어갈 수 있는건 그걸 구현한 클래스로 Payment 를 구현한 CardPayment가 들어갈 수 있다.
	
	2. Payment에 pay()를 새로 추가하면 기존 구현 클래스에는 어떤 영향이 있는가?
	Payment에 pay()를 새로 추가하면 기존 구현 클래스 CardPayment 클래스와 KakaoPayment 클래스에 오버라이딩을 해주던지 오버라이딩 안하면 abstact
	클래스로 변경해줘야한다.
	
	3. 반대로 default void cancel(){...}을 추가하면 기존 구현 클래스에는 어떤 차이가 있는가?
	default 메서드나 static 메서드를 추가할땐 기존 구현 클래스에는 오버라이딩을 굳이 할 필요 없다.
	
	4. CardPayment.pay()를 구현할 때 왜 public을 붙여야 하는가?
	인터페이스 클래스인 Payment 에는 public이 default 로 생략되어있고 구현클래스에서 메서드는 오버라이딩 시 기존 메서드의 접근제어자 보다 같거나 넓어야 하기 때문에 
	public 으로 제어자를 정해줘야 한다.
	
	 */

}
