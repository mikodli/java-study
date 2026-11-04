package day15;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;


class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        LocalDate date =
                LocalDate.of(2026, 11, 4);

        LocalTime time =
                LocalTime.of(15, 30, 20);

        LocalDateTime dateTime =
                LocalDateTime.of(date, time);

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        System.out.println(dateTime.getYear());
        System.out.println(dateTime.getHour());
        
        /*
         
		1. 출력 5줄은?
		2026-11-04
		15:30:20
		2026-11-04T15:30:20
		2026
		15
		
		2. LocalDate는 어떤 정보를 저장하는가?
		날짜 정보를 저장
		
		3. LocalTime은 어떤 정보를 저장하는가?
		시간정보를 저장
		
		4. LocalDateTime에는 시간대 정보가 포함되어 있는가?
		시간대 정보가 포한되어있지 않음
		
		5. LocalDateTime만으로 전 세계에서 동일한 순간을 특정할 수 있는가? 이유는?
		시간대 정보가 없기 때문에 동일한 순간을 특정할 수 없음 
         
         */
		
	}

}
