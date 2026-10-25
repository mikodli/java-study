package day10;

class LastTest6 {
	
	/*
	A.
	static void methodA() {
	    throw new IllegalArgumentException("A");
	}
	
	B.
	static void methodB() {
	    throw new Exception("B");
	}
	
	1. 컴파일 가능한가?
	A는 컴파일 가능 
	B는 컴파일 불가능

	2. 가능한/불가능한 이유는?
	A는 RuntimeException의 자식 예외 클래스로 unchecked 예외 클래스이고 컴파일러에서 예외처리나 선언을 따로 강제하지 않기 때문에 가능
	B는 Exception은 checked 예외 클래스이고 컴파일러에서 예외처리나 선언을 강제하기 때문
	
	3. 코드 B를 컴파일 가능하게 만드는 방법 2가지
	static void methodB() throws Exception{
	    throw new Exception("B");
	}
	
	static void methodB() {
	    try{
	    	throw new Exception("B");
	    }catch(Exception e){
	 		System.out.println(e.getMessage());
	    }
	}
	
	
	 */
	
}
