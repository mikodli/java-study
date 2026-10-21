package day9;

class LastTest8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		A. 
		B b = new B();
		   b.hello();
		가능 
		default 는 인스턴스 메서드 
		구현 객체가 사용가능
		
		B. 
		A a = new B();
		   a.hello();
		가능 
		default 는 인스턴스 메서드 
		구현 객체가 사용가능
		참조타입 A에 있는 멤버이기 떄문에
		
		C. 
		A.test();
		가능 
		test는 static 메서드로 인터페이스 자체에 속함
		그래서 인터페이스 명으로 호출이 가능
		
		D. 
		B.test();
		불가능
		test는 static 메서드로 인터페이스 자체에 속함
		구현 클래스에 상속되지 않기 때문에
		
		E. 
		A a = new B();
		a.test();
		불가능
		test는 static 메서드로 인터페이스 자체에 속함
		구현 객체를 통해 호출이 불가능하기 때문
		
		default 메서드 = 인스턴스 메서드
		static 메서드  = 클래스 메서드로 인터페이스 자체에 속함
		
		 */
		
	}

}
