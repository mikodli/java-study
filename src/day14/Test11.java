package day14;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        BigDecimal a = new BigDecimal("10");
        BigDecimal b = new BigDecimal("3");

        try {

            BigDecimal result = a.divide(b);

            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("정확히 나눌 수 없음");
        }

        BigDecimal result2 =
                a.divide(b, 2, RoundingMode.HALF_UP);

        System.out.println(result2);
	}
	/*
	
	1. 전체 출력 결과는?
	정확히 나눌 수 없음
	3.33
	
	2. 첫 번째 divide()는 왜 ArithmeticException이 발생하는가?
	10/3은 무한 순환소수가 되어 정확한 유한 소수 표현이 불가능하고, 반올림 방법을 지정하지 않은 devide()는 임의로 값을 잘라낼 수 없으므로 ArithmeticException을 발생시킴
	
	3. 두 번째의 2는 무엇을 의미하는가?
	반올림후 표현할 scale 값
	
	4. RoundingMode.HALF_UP은 어떤 반올림 방식인가?
	5이상이면 올리는 방식
	
	5. a와 b 자체의 값은 연산 후 변경되는가?
	BigDeciaml은 immutable 불변으로 divide는 나눈 값을 새로운 객체를 생성해 반환함
	
	 */

}
