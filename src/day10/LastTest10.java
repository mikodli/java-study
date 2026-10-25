package day10;

class LastTest10 {
	
	static void validate(int age) {

	    if (age < 0) {
	        throw new IllegalArgumentException("음수");
	    }

	    System.out.println("정상");
	}

	public static void main(String[] args) {

	    try {

	        validate(20);
	        validate(-1);
	        validate(30);

	        System.out.println("try 종료");

	    } catch (RuntimeException e) {

	        System.out.println("예외: " + e.getMessage());
	    }

	    System.out.println("프로그램 종료");
	}
	/*
	1. 전체 출력 결과를 순서대로 작성.
	정상
	예외: 음수
	프로그램 종료

	2. validate(-1)에서 실제 생성되는 예외 객체의 타입은?
	IllegalArgumentException
	
	3. 그런데 왜: catch (RuntimeException e) 가 받을 수 있는가?
	참조변수 e의 타입이 RuntimeException 예외 클래스이고 예외 객체의 타입인 IllegalArgumentException은 RuntimeException을 상속하고있기 때문
	
	4. validate(30)은 실행되는가? 이유는?
	실행되지 않는다.
	validate(-1);에서 예외가 발생해 그뒤에 try문은 실행하지 않고 catch로 예외를 처리하러감
	
	5. "try 종료"는 실행되는가? 이유는?
	try 종료는 실행하지 않음
	validate(-1);에서 예외가 발생해 그뒤에 try문은 실행하지 않고 catch로 예외를 처리하러감
	
	6. "프로그램 종료"는 실행되는가? 이유는?
	실행된다.
	try-catch문이 정상적으로 종료된 다음 출력문이라서.
	
	7. Java는 항상 Call by Value인데, catch(Exception e)에서 발생한 예외 객체를 처리할 수 있는 이유는 무엇인가?
	참조변수 e는 Exception 으로 발생한 예외 클래스 객체의 참조값을 전달 받기 때문.
	
	Java는 Call by Value이므로 예외 객체 자체가 전달되는 것이 아니라 예외 객체를 가리키는 참조값이 전달되고, catch의 참조변수 e가 그 참조값을 받아 동일한 예외 객체를 참조한다.
	
	 */
	
}
