package day10;

class LastTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A");

	    try {
	        System.out.println("B");

	        int number = 10 / 0;

	        System.out.println("C");

	    } catch (ArithmeticException e) {
	        System.out.println("D");
	    }

	    System.out.println("E");
	    /*
	    1. 출력순서
	    A
	    B
	    D
	    E
	    
	    2. C는 출력되지 않는다. int number = 10 / 0; 에서 ArithmeticException 발생해서 그 문장 이후 try문을 실행하지 않고 catch문에 예외를 찾으러가기 때문
	    
	    3. E는 출력된다. try - catch문이 종료되고 난 다음 출력문이라서.
	    
	     */
		
	}

}
