package day9;

class LastTest11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		A
		class PaymentService {

		    void pay(String type) {
		
		        if (type.equals("card")) {
		            System.out.println("카드 결제");
		        } else if (type.equals("kakao")) {
		            System.out.println("카카오 결제");
		        }
		    }
		}
		
		B
		interface Payment {
		    void pay();
		}
		
		class CardPayment implements Payment {
		    public void pay() {
		        System.out.println("카드 결제");
		    }
		}
		
		class KakaoPayment implements Payment {
		    public void pay() {
		        System.out.println("카카오 결제");
		    }
		}
		
		class PaymentService {
		
		    void pay(Payment payment) {
		        payment.pay();
		    }
		}
		
		설계 A는 type 내용이 추가될때마다 추가된 내용 외에도 클래스 PaymentService 부분을 계속 if문을 바꿔줘야 하지만 
		설계 B는 다형성으로 Payment 인터페이스를 참조타입으로 참조변수를 생성하고 신규 NaverPayment 같은 클래스를 구현 후 생성하면 객체로 생성만 해줘도 바로 
		인터페이스에 있는 pay()를 사용 가능하기 때문에
		
		 */
		
	}

}
