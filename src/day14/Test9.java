package day14;

import java.math.BigDecimal;

class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 	BigDecimal a = new BigDecimal(0.1);
	        BigDecimal b = new BigDecimal("0.1");
	        BigDecimal c = BigDecimal.valueOf(0.1);

	        System.out.println(a);
	        System.out.println(b);
	        System.out.println(c);
		
	}

	/*
	
	1. a, b, c 중 예상치 못한 긴 소수가 나타날 수 있는 것은?
	a
	
	2. 왜 그런가?
	double 형태의 매개변수는 에초에 소수점 자체가 부정확하기 때문.
	
	3. 금액 0.1을 표현해야 한다면 셋 중 어떤 방식을 사용하겠는가?
	"0.1" 인 String 형태이기 때문
	
	4. new BigDecimal(0.1)의 문제는 BigDecimal 자체가 부정확해서인가?
	double 형태의 매개변수는 에초에 소수점 자체가 부정확하기 때문.
		
	 */
	
}
