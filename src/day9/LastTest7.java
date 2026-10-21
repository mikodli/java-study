package day9;

class LastTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		interface Payment {
		    void pay();
		}
		
		class CardPayment implements Payment {
		    public void pay() {
		        System.out.println("Card");
		    }
		}
		
		class KakaoPayment implements Payment {
		    public void pay() {
		        System.out.println("Kakao");
		    }
		}
		
		메서드:
		static void process(Payment payment) {
		    payment.pay();
		}
		
		1. 다음 결과는?
		process(new CardPayment());
		process(new KakaoPayment());
		Card
		Kakao
		
		2. 매개변수 타입을 Payment 하나만 선언해도 두 객체를 모두 받을 수 있는 이유는?
		다형성
		매개변수 타입을 Payment 인터페이스로 선언했기 때문에 받을수 있는 것으로는 인터페이스를 구현하고있는 클래스의 실제 객체들로받을 수 있는데
		CardPayment , KakaoPayment 둘다 인터페이스 Payment를 구현하고 있기 때문
		
		그리고:
		static Payment create() {
		    return new CardPayment();
		}
		
		3. 반환형은 Payment인데 new CardPayment()를 반환할 수 있는 이유는?
		반환타입이 인터페이스일 경우 반환값은 인터페이스를 구현하고있는 실제 객체로 반환해야되기 때문에.
		
		 */
		
	}

}
