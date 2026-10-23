package day11;

class LastTest3 {
	
	static void process() {

	    try {

	        throw new java.io.IOException("파일 오류");

	    } catch (java.io.IOException e) {

	        System.out.println("파일 예외");
	    
	    } catch (Exception e) {

	        System.out.println("일반 예외");

	    } 
	}
	
	/*
	 1. 이 코드는 컴파일되는가?
	 컴파일X
	 
	 2. 안 된다면 정확한 이유는?
	 catch 의 순서 문제
	 
	 3. 개발자가 IOException은 별도로 처리하고 나머지 예외는 공통 처리하고 싶다면 어떻게 수정해야 하는가?
	 catch문에 IOException을 먼저 선언하고 그다음 catch문에 Exception으로 선언

	 4. 수정된 전체 try-catch 코드를 작성해봐.
	 위에 변경함
	 
	 5. 왜 catch를 작성할 때 일반적으로 구체적인 자식 예외 → 넓은 부모 예외 순서가 필요한가?
	 catch의 ()안에 참조변수와 발생한 에러 클래스 객체를 instanceof 로 판별하고 catch문은 위에서 부터 순서대로 확인하며 하나의 catch문이 실행되면 뒤에 catch문은 실행하지 않기 때문
	 
	 
	 
	 */

}
