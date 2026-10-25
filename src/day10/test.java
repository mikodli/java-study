package day10;

class test {
	
	/*
	1.
	static void test() {
    	throw new RuntimeException("문제 발생");
	}
		1. 컴파일 가능한가?
			가능하다.
			
	    2. try-catch나 throws가 없는데 왜 가능한가?
	    	왜냐하면 RuntimeException과 그 자식 클래스들은 unchecked 예외라 
	    	컴파일러가 예외 처리 (catch) 또는 선언 (throws)을 강제하지 않기 때문
	    	    
    2.
    static void test() {
	    throw new Exception("문제 발생");
	}
    
	    1. 컴파일 가능한가?
	    	불가능
	    	
		2. 안 된다면 왜?
			Exception 예외 클래스는 checked 예외라 컴파일러에서 확인하기 때문
			
		3. 컴파일되게 만드는 방법을 2가지
	    	1. 메서드 자체에 throws Exception 을 붙여 예외를 선언한다.
	    	
	    	2. throw new Exception("문제 발생"); 부분을 try 블럭에넣고 try-catch 문을 만든다.
	    	
    3.
    static void methodA() throws Exception {
	    throw new Exception("A에서 발생");
	}
	
	static void methodB() throws Exception {
	    methodA();
	}
	
	public static void main(String[] args) {
	
	    try {
	        methodB();
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
    
    1. 출력 결과는?
    A에서 발생    

	2. 예외가 이동하는 흐름
    methodA() -> methodB() -> main try methodB();
    
    3. methodA()의 throws Exception은 예외를 발생시키는 것인가, 선언하는 것인가?
	예외를 선언하는것

	4. 실제 예외를 발생시키는 코드는 정확히 어느 부분인가?
    methodA() 에 throw new Exception("A에서 발생");이부분에 throw가 예외를 발생시킴
    
    
    
    
    
	 */
	
}
