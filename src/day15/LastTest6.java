package day15;

import java.time.LocalDate;

class LastTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        LocalDate a =
                LocalDate.of(2026, 11, 4);

        LocalDate b = a;

        a.plusMonths(1);

        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);

        a = a.plusMonths(1);

        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);
        
        /*

		1. 출력 6줄은?
		2026-11-04
		2026-11-04
		true
		2026-12-04
		2026-11-04
		false
		
		2. 첫 번째 a.plusMonths(1)에서 반환된 값은 어떻게 되는가?
		반환은 plusMonths(1)이 적용된 새로운 객체를 반환 그 반환값을 사용하지 않으므로 버려짐
		
		3. LocalDate가 immutable이라는 것은 무슨 의미인가?
		불변 LocalDate 타입으로 생성한 객체의 내용은 변경되지 않음
		
		4. a = a.plusMonths(1) 이후 a와 b의 참조 관계를 설명해라.
		b는 LocalDate.of(2026, 11, 4); 로 생성된 객체를 참조
		a는 LocalDate.of(2026, 11, 4); 객체에서 plusMonths(1)로 처리된 값을 새로운 객체로 생성해 참조
		
		5. Chapter 9에서 학습한 불변 클래스 세 가지를 작성해라.
		String
		BigInteger
		BigDecimal
		
		6. StringBuilder도 불변 클래스인가?
       	가변
        
        
         */
		
	}

}
