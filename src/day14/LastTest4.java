package day14;

class LastTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int max = Integer.MAX_VALUE;

	        System.out.println(max + 1);

	        try {

	            int result =
	                    Math.addExact(max, 1);

	            System.out.println(result);

	        } catch (ArithmeticException e) {

	            System.out.println("오버플로 발생");
	        }

	        System.out.println("END");
	        
	        /*
	        
			1. 전체 출력 결과는?
			-2147483648
			오버플로 발생
			END
			
			2. max + 1에서 overflow가 발생했는데 왜 예외가 발생하지 않는가?
			Java의 일반적인 int 산술 연산에서 정수 overflow 자체가 예외를 발생시키도록 정의되어 있지 않기 때문이다
			
			3. Math.addExact(max, 1)에서는 왜 ArithmeticException이 발생하는가?
			addExact메서드는 덧셈 결과가 int 범위로 정상적이 값이 나오는지 확인하고 overflow 발생 시 ArithmeticException을 발생시키도록 되어있기 때문에.
			
			4. "END"가 출력되는 이유는?
	        addExact()에서 ArithmeticException이 발생 했고 catch문에서 예외를 처리했기 때문
	        
	         */

	}

}
