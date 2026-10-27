package day13;

class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int max = Integer.MAX_VALUE;

	        System.out.println(max);
	        System.out.println(max + 1);

	        try {
	            int result = Math.addExact(max, 1);
	            System.out.println(result);

	        } catch (ArithmeticException e) {
	            System.out.println("오버플로 감지");
	        }

	        System.out.println(Math.max(10, 20));
	        System.out.println(Math.abs(-30));
	        
	        /*
	        1. 전체 출력 결과
	        2147483647
			-2147483648
			오버플로 감지
			20
			30

			2. max + 1에서 왜 예외가 발생하지 않는가?
			연산자는 예외처리하지 않고 연산만 반환하기 때문
			* Java의 일반적인 int 산술 연산에서 정수 overflow 자체가 예외를 발생시키도록 정의되어 있지 않기 때문이다.
			
			3. 결과값은 왜 이상하게 바뀌는가?
			int에서 갖을 수 있는 값보다 크기때문에 오버플로우가 발생
			
			4. Math.addExact()는 무엇이 다른가?
			Exact 가 붙은 메서드는 예외가 발생하면 예외가 발생되도록 입력이 되어있다.
			
			5. 발생하는 예외 타입은?
			ArithmeticException
	         */

	}

}
