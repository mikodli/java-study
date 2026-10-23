package day11;

class Test3 {

	static void validate(int age) {
	    if (age < 0) {
	        throw new AgeException("잘못된 나이");
	    }
	}
	
	/*
	1. AgeException은 checked / unchecked 중 무엇인가?
	unchecked 
	
	2. 이유는?
	AgeException클래스가 상속받고 있는 예외 클래스가 unchecked exception인 RuntimeException이기 때문
	
	3. super(message)의 역할은?
	상속받고 있는 부모의 생성자를 호출
	
	4. 다음 메서드는 throws AgeException 없이 컴파일 가능한가?
	컴파일 가능 AgeException은 unchecked exception인 RuntimeException을 상속받아 만든 Exception이므로 동일하게 unchecked Exception이기 떄문이다.
	
	 */
	
}
