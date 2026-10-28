package day14;

import java.math.BigDecimal;
import java.math.RoundingMode;

class LastTest11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        BigDecimal a =
            new BigDecimal("10.0");

        BigDecimal b =
            new BigDecimal("10.00");

        System.out.println(
            a.equals(b)
        );

        System.out.println(
            a.compareTo(b) == 0
        );

        BigDecimal x =
            new BigDecimal("10");

        BigDecimal y =
            new BigDecimal("4");

        BigDecimal result =
            x.divide(
                y,
                2,
                RoundingMode.HALF_UP
            );

        System.out.println(result);

        /*
        
		1. 출력 3줄은?
		false
		true
		2.50
		
		2. a.equals(b)가 그 결과인 이유는?
		BigDecimal 클래스에 equals 문은 값자체를 비교하는것이 아닌 값과 sacle 값 까지 비교하는데 a는 scale 1 b 는 sacle 2이기 때문
		
		3. a.compareTo(b) == 0이 그 결과인 이유는?
		compareTo메서드는 값의 크기를 비교해 a가 b보다 크면 양수 작으면 음수 같으면 0으로 출력하기 때문
		
		4. compareTo()가 0을 반환한다는 것은 정확히 무슨 의미인가?
		compareTo()가 0을 반환한다는 것은 두 값의 크기가 일치한다는 것.
		
		5. result의 scale은?
		2
		
		6. RoundingMode.HALF_UP은 어떤 반올림 방식인가?
		5이상이면 올림처리 하는 방식
		
		7. BigDecimal도 mutable인가 immutable인가?
		immutable
		
		8. 왜 아래 코드는 금액 계산에서 조심해야 하는가?
		new BigDecimal(0.1);
		0.1 은 자체가 double 형으로 double 형의 소수점은 정확하지 않기 때문
		
		9. 정확한 0.1을 표현하려면 어떤 방식을 사용하는 것이 좋은가?
		new BigDecimal("0.1");
		BigDecimal.valueOf(0.1);
        
        new BigDecimal("0.1");
        String 형 매개변수를 받는 생성자로 받는것이 가장 좋음
        
         */
        
	}

}
