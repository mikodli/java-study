package day10;

class LastTest8 {

	static void methodA() throws Exception {
	    throw new Exception("ERROR");
	}

	static void methodB() throws Exception {
	    methodA();
	}

	static void methodC() {

	    try {
	        methodB();
	    } catch (Exception e) {
	        System.out.println("처리: " + e.getMessage());
	    }
	}

	public static void main(String[] args) {
	    methodC();
	    System.out.println("종료");
	}
	
	/*
	1. 메서드 호출 순서
	main -> methodC() -> methdB() -> methodA()

	2. 예외가 발생하는 정확한 위치
	methodA()

	3. 예외 전파 순서
	methodA() -> methodB() -> methodC() -> 예외처리

	4. 전체 출력 결과
	처리 : ERROR
	종료

	5. 프로그램은 정상 종료 / 비정상 종료 중 어느 쪽인가?
	정상종료

	6. 그 이유는?
	methodC()에서 try - catch 문에서 예외가 처리되었기 때문
	
	 */
	
}
