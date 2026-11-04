package day15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate start =
                LocalDate.of(2026, 1, 1);

        LocalDate end =
                LocalDate.of(2026, 2, 5);

        Period period =
                Period.between(start, end);

        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        System.out.println(
            ChronoUnit.DAYS.between(start, end)
        );

        LocalDateTime t1 =
                LocalDateTime.of(2026, 11, 4, 10, 0);

        LocalDateTime t2 =
                LocalDateTime.of(2026, 11, 4, 12, 30);

        Duration duration =
                Duration.between(t1, t2);

        System.out.println(duration.toMinutes());
        
        /*
        
		1. 출력 4줄은?
		1
		4
		35
		150
		
		2. Period와 Duration의 차이는?
		다른 단위를 다룸
		
		3. period.getDays()와 ChronoUnit.DAYS.between()이 다른 값을 반환하는 이유는?
		period.getDays()는 두 날짜의 일자값만 비교하고 ChronoUnit.DAYS.between()은 두 날의 차이를 일수로 반환함 
		
		* Period.between(start, end)으로 계산한 연·월·일 차이중 period.getDays() 일을 반환 1개월 4일 에서 4일만 반환
		ChronoUnit.DAYS.between(start, end) 두날짜 사이의 총 경과 일수를 반환
		
		4. Period.between()은 어떤 타입을 반환하는가?
		Period
		
		5. Duration.between()은 어떤 타입을 반환하는가?
		Duration
		
		6. Period.ofDays(1)과 Duration.ofHours(24)는 언제 서로 다르게 해석될 수 있는가?
		일광절약시간제(DST)가 적용되는 지역에서 다르게 해석 될 수 있음
        
         */
		
	}

}
