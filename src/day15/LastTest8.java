package day15;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

class LastTest8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Instant instant =
	                Instant.parse(
	                    "2026-11-04T00:00:00Z"
	                );

	        ZonedDateTime seoul =
	                instant.atZone(
	                    ZoneId.of("Asia/Seoul")
	                );

	        System.out.println(instant);
	        System.out.println(seoul);
	        System.out.println(seoul.toInstant().equals(instant));
	        
	        /*

			1. 출력 3줄은?
			2026-11-04T00:00:00Z
			2026-11-04T09:00:00+09:00[Asia/Seoul]
			true
			
			2. 문자열 끝의 Z는 정확히 무엇을 의미하는가?
			UTC 오프셋 +00:00을 의미하는 표기
			
			3. Instant 객체 자체에 ZoneId가 저장되는가?
			ZoneId는 저장되지 않는다.
			
			4. Instant와 LocalDateTime의 가장 중요한 차이는?
			Instant는 타임라인상의 특정 순간을 나타내고
			LocalDateTime은 시간대나 오프셋이 없는 날짜 시간을 나타냄
			
			5. 서로 다른 서버에서 동일한 이벤트 발생 시각을 저장하려면 어떤 개념을 기준으로 처리해야 하는가?
			isEqual로 비교하거나 비교할 시간을 toInstant로 변환해 equals를 함
	        
	         */
		
	}

}
