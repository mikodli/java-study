package day8;

class LastTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p = new Child();

		System.out.println(p.x); // A
		p.print();               // B

		Child c = (Child) p;

		System.out.println(c.x); // C
		c.print();               // D
		
		/*
		1. A~D의 출력값과 이유
		A의 출력값은 10
		인스턴스 변수는 참조변수의 타입을 따라가기 때문
		
		B의 출력값은 Child
		오버라이딩 된 메서드는 생성된 객체를 따라가기 때문
		
		C의 출력값은 20
		c.x인 인스턴스 변수는 참조변수 c에 타입 Child를 따라가기 때문
		
		D의 출력값은 Child
		오버라이딩 된 메서드는 생성된 객체를 따라가기 때문
		
		 */
		
	}

}
