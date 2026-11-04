package day15;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Instant instant =
                Instant.parse(
                    "2026-11-04T06:00:00Z"
                );

        ZonedDateTime seoul =
                instant.atZone(
                    ZoneId.of("Asia/Seoul")
                );

        ZonedDateTime utc =
                instant.atZone(
                    ZoneId.of("UTC")
                );

        System.out.println(instant);
        System.out.println(seoul);
        System.out.println(utc);

        System.out.println(
            seoul.toInstant().equals(
                utc.toInstant()
            )
        );
		
        /*
        
		1. 출력 4줄은?
		2026-11-04T06:00:00Z
		2026-11-04T15:00+09:00[Asia/Seoul]
		2026-11-04T06:00Z[UTC]
		true
		
		2. Z는 무엇을 의미하는가?
		UTC 오프셋 +00:00을 의미하는 표기
		
		3. 서울과 UTC의 시각이 다르게 표시되는 이유는?
		ZoneId가 다르기 때문
		
		4. seoul과 utc는 서로 다른 순간을 나타내는가?
		같은 순간을 나타냄
		
		5. Instant 자체에 ZoneId가 저장되어 있는가?
		ZoneId는 저장되지 않음
        
         */
        
	}

}
