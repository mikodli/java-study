package day15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

class LastTest11 {

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
		
		2. Period.between()의 반환 타입은?
		Period
		
		3. Duration.between()의 반환 타입은?
		Duration
		
		4. duration.toMinutes()의 반환 타입은?
		long
		
		5. period.getDays()와 ChronoUnit.DAYS.between()의 차이는?
		period.getDays() 는 Period.between으로 계산된 1개월 4일 중에 4일이라는 값을 반환
		ChronoUnit.DAYS.between()은 차이를 일수로 반환
		
		6. Period.ofDays(1)과 Duration.ofHours(24)가 일광절약시간제(DST) 환경에서 다르게 해석될 수 있는 이유는?
        Period와 Duration은 서로 다른 단위를 다루기 때문
        * 일광절약시간제가 시작되거나 끝나는 날에는 현지 날짜상 하루가 실제 경과시간으로는 23시간 또는 25시간이 될 수 있음
        Period.ofDays(1)은 달력상의 하루
		Duration.ofHours(24)는 정확히 24시간
        
         */
		
	}

}
