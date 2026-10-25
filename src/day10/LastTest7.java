package day10;

class LastTest7 {

	static void methodA() throws Exception {
	    throw new Exception("문제");
	}
	
	/*
	1. throws Exception 역할 
	throws Exception은 예외를 선언한것으로 예외를 호출자에게 전파될 수 있음을 선언함
	
	2. throw new Exception("문제"); new Exception(...)의 역할
	Exception("문제") 예외클래스의 객체를 생성
	
	3. throw의 역할
	Exception 예외를 발생시킴
	
	4. 다음 문장을 O/X 판단: throws Exception을 작성하면 그 메서드에서 발생한 Exception을 처리한 것이다.
	X throws Exception 예외를 호출자에게 전파될 수 있음을 선언함 - 예외를 선언함
	
	 */
	
}
