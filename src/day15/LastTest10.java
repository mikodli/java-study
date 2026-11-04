package day15;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;

class LastTest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate date =
                LocalDate.of(2026, 11, 9);

        LocalDate nextMonday =
                date.with(
                    TemporalAdjusters.next(
                        DayOfWeek.MONDAY
                    )
                );

        LocalDate sameOrNextMonday =
                date.with(
                    TemporalAdjusters.nextOrSame(
                        DayOfWeek.MONDAY
                    )
                );

        LocalDate lastDay =
                date.with(
                    TemporalAdjusters.lastDayOfMonth()
                );

        System.out.println(nextMonday);
        System.out.println(sameOrNextMonday);
        System.out.println(lastDay);
        System.out.println(date);
        
        /*
        
		1. 출력 4줄은?
		2026-11-16
		2026-11-09
		2026-11-30
		2026-11-09
		
		2. next()와 nextOrSame()의 차이는?
		next()는 현재를 포함하지 않음
		nextOrSame()은 현재를 포함해서 찾음
		
		3. lastDayOfMonth()는 무엇을 반환하는가?
		일자를 그 달의 마지막날로 변환해서 반환 새로운 객체를 반환
		
		4. with()를 호출하면 기존 date 객체의 내용이 변경되는가?
		기존 date 객체의 내용을 변경하는것이 아닌 기존 date 객체에 변경한 with()내용을 새로운 객체로 반환하기때문
		
		5. 매월 마지막 날 예약 마감일을 계산할 때 이 API가 유용한 이유는?
		객체가 불변하기 때문에 마지막 날을 구할때 오류가 없음
		* lastDayOfMonth()는 월별 일수와 윤년을 고려해 마지막 날짜를 계산해 주기 때문
        
         */
		
	}

}
