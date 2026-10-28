package day14;

import java.math.BigDecimal;

class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BigDecimal a = new BigDecimal("100.0");
        BigDecimal b = new BigDecimal("100.00");

        System.out.println(a.equals(b));
        System.out.println(a.compareTo(b));

        System.out.println(a.compareTo(b) == 0);
	}
	/*

	1. 세 줄 결과는?
	false
	0
	true
	
	2. equals()가 그 결과인 이유는?
	BigDecimal 클래스의 equals 는 객체 그 값자체만 비교하는것이 아닌 sacle 값까지 비교하기 때문에 a는 1 b는 2 라 false
	
	3. compareTo()가 0이라는 의미는?
	두 값의 수치적으로 비교를 하는데 0은 수치적으로 동일다는 의미이다.
	
	4. 금액의 수치적 동일성을 확인하려면 어떤 방법이 더 적절한가?
	compareTo() 사용이 더 적절함
	
	 */

}
