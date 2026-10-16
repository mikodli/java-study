package day7;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Account a1 = new Account(1001);
	        Account a2 = new Account(1002);

	        a1.deposit(10000);
	        a2.deposit(20000);
	        /*
	        1. balance를 private으로 만든 이유는?
	          지금 선언한 상태로는 계좌의 잔금 상태를 나타내는데 직접 데이터를 변경하면 데이터 오류가 발 생 할 수 있기 때문에 클래스 내에 메서드 연산을 통한 데이터 접근이 필요하기 때문
	        ** 외부에서 객체의 상태를 임의로 망가뜨리는 것을 막고 클래스가 제공하는 메서드를 통해 검증 후 상태를 변경하게 하기 위함  
			2. Test1에서 a1.balance = -10000;은 가능한가? 이유는?
			불가능 balance 는 접근제어자가 private으로 선언되어 같은 클래스내에서만 접근 가능
			
			3. accountCount의 최종 값은?
			2 클래스 변수로 선언되어 모든 인스턴스에서 하나의 변수로 사용하고 accountCount값을 변경해주는 ++이 Account(int accountNumber) 생성자에만 있으며
			new Account로 두번 생성되었기 떄문 
			
			4. accountCount는 객체마다 별도로 존재하는가?
			클래스 변수로 하나 의 변수로 선언되어있다.
			
			5. a1.accountNumber = 9999;가 불가능한 이유는?
			accountNumber 는 final로 선언되었고 Account(int accountNumber) 생성자로 초기화 되어 재대입이 불가능함
			
			6. final Account a3 = new Account(1003); 이후 a3.deposit(5000);은 가능한가? 그렇다면 a3 = new Account(1004);는?
			a3은 참조변수로 final이 사용이 가능하고  
			a3.deposit(5000)은 메서드 호출이므로 사용이 가능하고 ** a3에 저장된 참조값을 변경한 것이 아니고 같은 객체의 메서드를 호출해서 객체 내부 상태를 변경한 것
			new Account(1004)로 새로운 객체를 생성하고 새 객체의 참조값을 a3에 재대입하려 하기 때문에 불가능
			
			7. Account 생성자 앞에 접근 제어자를 아무것도 적지 않았는데, 이 생성자의 접근 범위는 어디까지인가?
	        아무것도 적지 않으면 default 접근 제어자로 되어있고 default는 같은 패키지 내에 접근이 가능함.
	        
	         */
	}

}
