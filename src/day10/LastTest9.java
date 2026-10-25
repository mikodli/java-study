package day10;

class LastTest9 {

	static void method() throws RuntimeException {

	    throw new IllegalArgumentException("문제");
	}
	
	/*
	1. 컴파일 가능한가?
	가능함

	2. IllegalArgumentException과 RuntimeException의 상속관계를 설명.
	RuntimeException 예외 클래스는 부모 IllegalArgumentException 예외 클래스는 자식으로 상속받고있음
	
	3. 여기서: throws RuntimeException 을 제거하면 컴파일 가능한가?
	가능하다.
	
	4. 왜?
	RuntimeException 예외 클래스는 unchecked 예외라 컴파일러에서 예외처리나 선언을 강제하지 않기 때문
	
	5. 그렇다면 throws RuntimeException은 문법적으로 쓸 수는 있지만 컴파일을 위해 반드시 필요한가?
	컴파일을 위해 반드시 필요하진 않다.
	
	 */
	
}
