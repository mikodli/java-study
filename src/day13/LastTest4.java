package day13;

class LastTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.MAX_VALUE;

		int b = a + 1;

		System.out.println(b);

		try {

		    int c = Math.multiplyExact(a, 2);

		    System.out.println(c);

		} catch (ArithmeticException e) {

		    System.out.println("연산 실패");
		}

		System.out.println("프로그램 계속");
		
		/*
		
		1. 전체 출력 결과는?
		-2147483648

		2. a + 1은 overflow인데 왜 예외가 발생하지 않는가?
		Java의 일반적인 int 산술 연산에서 정수 overflow 자체가 예외를 발생시키도록 정의되어 있지 않기 때문이다.
		
		3. Math.multiplyExact(a, 2)에서는 왜 예외가 발생하는가?
		multyplyExact()는 곱셈 결과가 int 범위를 벗언나는지를 검사하고, overflow가 발생하면 잘못된 값을 반환하는 대신 ArithmeticException을 발생시킨다.
		a는 이미 int 의 MAX 값이 들어있는데 a와 2를 곱하는 연산을 할 시 오버플로우가 발생하기 때문에.
		
		4. catch 이후 "프로그램 계속"이 출력되는 이유는?
		try{} 에서 발생한 예외를 catch()블럭에서 처리되어서 try - catch 문 이후 코드가 실행된다.
		
		 */

	}

}
