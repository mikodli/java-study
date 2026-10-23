package day11;

class Test1 {
	static int test(int number) {

	    try {

	        System.out.println("A");

	        if (number == 0) {
	            throw new IllegalArgumentException("ZERO");
	        }

	        System.out.println("B");
	        return 10;

	    } catch (IllegalArgumentException e) {

	        System.out.println("C");
	        return 20;

	    } finally {

	        System.out.println("D");
	    }
	}
	/*
	1. System.out.println(test(1)); 출력 순서
	A
	B
	D
	10
	
	2. System.out.println(test(0)); 출력 순서
	A
	C
	D
	20	
	
	3. 두 경우 모두 D가 출력되는 이유
	D는 finally 블럭에 있고 try-catch문에 붙은 finally try-catch 문이 예외가 발생하든 발생안하든 예외처리를 하든 return을 하든 finally 블록은 실행되기 때문에
	
	4. finally에 return 30;을 추가하면 두 호출의 최종 반환값은?
	30
	
	 */
}
