package day15;

import java.time.LocalDate;

class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate a =
                LocalDate.of(2026, 11, 4);

        LocalDate b = a;

        a.plusDays(10);

        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);

        a = a.plusDays(10);

        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);

        /*
        
		1. 출력 6줄은?
		2026-11-04
		2026-11-04
		true
		2026-11-14
		2026-11-04
		false
		
		2. 첫 번째 a.plusDays(10) 이후 a가 변경되지 않는 이유는?
		LocalDate 는 불변이라 a.plusDays(10)은 plusDays 10을 한 새로운 객체를 반환하기 때문
		
		3. LocalDate가 immutable이라는 것은 무슨 의미인가?
		LocalDate 가 한번 초기화 된 뒤로 변경되지 않음
		
		4. a = a.plusDays(10) 이후 a와 b의 참조 관계는?
		b는 처음 만든 LocalDate.of(2026, 11, 4) 의 객체를 참조하고
		a는 LocalDate.of(2026, 11, 4) 의 객체에서 plusDays(10)을 한 결과를 새로운 객체로 반환해서 그 객체를 참조
		
		5. 이 개념은 Chapter 9에서 배운 어떤 클래스들과 연결되는가?
		String
		BigInteger
		BigDecimal
		
        
         */
        
	}

}
