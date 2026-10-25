package day10;

class test2 {

	static void methodC() throws Exception {
	    methodB();
	}

	static void methodB() throws Exception {
	    methodA();
	}

	static void methodA() throws Exception {
	    throw new Exception("문제");
	}

	public static void main(String[] args) throws Exception {
	    methodC();
	}

	/*
	1. 컴파일은 되는가?
	컴파일 된다.
	예외가 발생해도 마지막 main에서도 throws Exception이 있기때문에 예외를 처리하지 않고 호출자에게 전파할 수 있도록 선언했기 때문에 컴파일이 가능
	
	2. 호출 순서는?
	main -> methodC() -> methodB() -> methodA() 
	
	3. 예외 전파 순서는?
	methodA() -> methodB() -> methodC() -> main
	
	4. main에도 throws Exception이 있으므로 최종적으로 누가 이 예외를 처리하는가?
	프로그램 코드에서는 아무도 처리하지 않고 JVM 으로 전달하고 JVM 에서 처리되지 않은 예외에 대해 기본 예외 처리 동작으로 예외 정보와 stack trace가 출력되고 해당 스레드가 종료된다.
	
	5. 프로그램은 정상 종료하는가, 비정상 종료하는가?
	프로그램은 비정상 종료한다.
	
	 */
	
}
