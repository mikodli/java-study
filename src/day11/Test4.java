package day11;

class Test4 {
	static void methodA() throws Exception {

	    try {
	        throw new Exception("ERROR");

	    } catch (Exception e) {

	        System.out.println("A");
	        throw e;
	    }
	}

	public static void main(String[] args) {

	    try {
	        methodA();

	    } catch (Exception e) {

	        System.out.println("B");
	    }
	}
	
	/*
	1. 출력 결과
	A
	B
	
	2. methodA()의 catch에서 예외 처리가 끝나지 않는 이유
	methodA() try{} 에서 new Exception("ERROR") 예외 클래스 객체를 생성 후 throw로 Exception 예외를 발생시킴
	그래서 catch로 와서 Exception 예외처리 진행 A출력문 후 throw e; 로 catch블럭에서 다시 예외를 발생시켰기 때문
	
	3. throw e에서 새로운 Exception 객체가 생성되는가?
	throw e 에서는 Exception 객체가 생성된것이 아닌 try문에서 발생한 Exception 객체를 참조변수 e가 객체의 참조값을 참조한다.
	
	4. 이 코드가 예외 되던지기인 이유
	메서드 안에있는 try-catch 문에서 예외처리를 하고 catch문에서 다시 동일한 예외를 발생시켜 다음 호출하는 메서드로 예외처리를 넘겨줬기 떄문.
	
	
	 */
	
}
