package day15;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;


class LastTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 LocalDateTime dateTime =
	                LocalDateTime.of(2026, 11, 4, 15, 0);

	        ZonedDateTime seoul =
	                dateTime.atZone(
	                    ZoneId.of("Asia/Seoul")
	                );

	        ZonedDateTime utc =
	                dateTime.atZone(
	                    ZoneId.of("UTC")
	                );

	        System.out.println(dateTime);
	        System.out.println(seoul);
	        System.out.println(utc);

	        System.out.println(
	            seoul.toInstant().equals(
	                utc.toInstant()
	            )
	        );

	        /*

			1. 출력 4줄은?
			2026-11-04T15:00
			2026-11-04T15:00+09:00[Asia/Seoul]
			2026-11-04T15:00Z[UTC]
			false
			
			2. LocalDateTime에 시간대 정보가 저장되어 있는가?
			시간대 정보가 저장되어있지 않음
			
			3. 서울과 UTC의 출력 시각이 같아 보이는 이유는?
			dateTime이 이 LocalDateTime 타입으로 시간대 정보가 없기 때문에 설정된 시간 그대로 표현
			
			4. seoul과 utc는 동일한 순간을 나타내는가?
			다른 순간을 나타냄
			
			5. LocalDateTime만으로 전 세계에서 동일한 순간을 특정할 수 있는가?
			동일한 순간을 특정할 수 없음 시간대 정보가 없기 때문
			
			6. atZone()은 어떤 역할을 하는가?
	         시간대 정보를 입력
	        
	         */
	        
	}

}
