package day15;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;

class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate date =
                LocalDate.of(2026, 11, 4);

        LocalDate firstDay =
                date.with(
                    TemporalAdjusters.firstDayOfMonth()
                );

        LocalDate lastDay =
                date.with(
                    TemporalAdjusters.lastDayOfMonth()
                );

        LocalDate nextMonday =
                date.with(
                    TemporalAdjusters.next(
                        DayOfWeek.MONDAY
                    )
                );

        System.out.println(firstDay);
        System.out.println(lastDay);
        System.out.println(nextMonday);
        System.out.println(date);
        
        /*
        
		1. 출력 4줄은?
		2026-11-01
		2026-11-30
		2026-11-09
		2026-11-04
		
		2. firstDayOfMonth()의 역할은?
		일자를 그달의 첫 일로 변경
		
		3. lastDayOfMonth()의 역할은?
		일자를 그달의 마지막 일로 변경
		
		4. next(DayOfWeek.MONDAY)는 어떤 날짜를 구하는가?
		일자를 그 설정된 일의 다음주 월요일의 일자로 변경
		* 기준 날자 이후 처음으로 오는 월요일
		
		5. date 자체는 변경되는가?
		참조변수 date가 참조하는 참조값의 내용은 변하지 않음 불변 immutable		
        
         */
		
	}

}
