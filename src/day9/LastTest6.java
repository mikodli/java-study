package day9;

class LastTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payment p = new CardPayment();
		
		/*
		interface Payment {
		    void pay();
		}
		
		class CardPayment implements Payment {
		
		    @Override
		    public void pay() {
		        System.out.println("카드");
		    }
		
		    void cardOnly() {
		        System.out.println("카드 전용");
		    }
		}
		
		
		Payment p = new CardPayment();
		
		A. p.pay();
		가능함 참조변수 p는 참조타입으로 인터페이스 Payment인데 실제 객체는 인터페이스를 구현하고있는 CardPayment 이고
		pay()는 오버라이딩 되어있어 호출이 가능함 

		B. p.cardOnly();
		cardOnly 호출 불가능 
		CardPayment() 실제 객체에는 cardOnly() 메서드가 있지만 참조변수 타입인 Payment에 멤버에는 없기때문에 접근이 불가능 하다.
		
		C. CardPayment c = (CardPayment) p;
		   c.cardOnly();
		가능함
		참조변수 p의 실제 객체는 CardPayment 이고 참조타입이 Payment 에서 CardPayment 다운캐스트 했기때고 참조 변수 c는 참조타입이 CardPayment 이기떄문에 접근이 가능함
		
		
		 */
		
	}

}
