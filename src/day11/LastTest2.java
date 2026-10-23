package day11;

class LastTest2 {

	static void repository() throws Exception {

	    System.out.println("1");

	    throw new Exception("DB ERROR");
	}

	static void service() throws Exception {

	    System.out.println("2");

	    try {

	        repository();

	        System.out.println("3");

	    } catch (Exception e) {

	        System.out.println("4");

	        throw e;

	    } finally {

	        System.out.println("5");
	    }
	}

	public static void main(String[] args) {

	    System.out.println("6");

	    try {

	        service();

	        System.out.println("7");

	    } catch (Exception e) {

	        System.out.println("8");
	    }

	    System.out.println("9");
	}
	
	/*
	1. 전체 출력 순서
	6
	2
	1
	4
	5
	8
	9

	2. "3"이 실행되지 않는 이유
	repository() 메서드에서 Exception이 발생했고 그걸 호출하는 메서드에 전파했기 때문에 그 뒤에 있는 try 블럭은 실행하지 않고 catch문으로 예외처리 찾으러가기 때문

	3. "5"는 왜 실행되는가?
	finally 는 그 블럭이 속한 try-catch문의 예외처리 후에도 finally 블럭은 실행되기 때문

	4. "7"이 실행되지 않는 이유
	service()메서드에서 catch()블럭에 throw e; 로 Exception을 호출하고 있는 메서드 main으로 예외처리를 전파했기 때문에 service();에서 예외가 발생해 그 뒤에 문장은 실행하지 않고 
	catch문으로 예외처리를 찾으러 가기 때문

	5. service()의 throw e에서 새로운 예외 객체가 생성되는가?
	throw e은 참조변수 e가 참조하고있는 new Excpetion("DB ERROR");로 생성된 예외 객체의 참조값을 보는거지 새로운 객체를 생성하는것이 아님.

	6. 최초 생성된 Exception("DB ERROR") 객체가 main()까지 어떻게 전달되는지 참조값 관점에서 설명해봐.
	new Exception("DB ERROR") 객체가 생성되고 throws Exception으로 호출하고 있는 메서드로 예외를 전파될 가능성이 있음을 선언
	-> service()메서드에서 repository(); 문에서 객체예외를 확인하고 catch블럭의 참조변수 e에 객체의 참조값을 전달
	-> throw e;로 예외를 발생시키고 service() throws Exception으로 호출하고 있는 메서드로 예외를 전파될 가능성이 있음을 선언
	-> main 메서드의 service(); 에서 예외를 확인하고 catch 블럭의 참조변수 e에 참조값을 전달함
	
	
	 */
	
}
