package day15;

import java.time.ZonedDateTime;

class LastTest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 	ZonedDateTime a =
	                ZonedDateTime.parse(
	                    "2026-11-04T15:00:00+09:00[Asia/Seoul]"
	                );

	        ZonedDateTime b =
	                ZonedDateTime.parse(
	                    "2026-11-04T06:00:00Z[UTC]"
	                );

	        System.out.println(a.equals(b));
	        System.out.println(a.isEqual(b));
	        System.out.println(a.toInstant().equals(b.toInstant()));
	        System.out.println(a.isAfter(b));
	        
	        /*
	        
			1. 출력 4줄은?
			false
			true
			true
			false
			
			2. equals()와 isEqual()의 차이는?
			equals()는 시간, 시간대까지 비교
			isEqual()은 그 순간 자체를 비교
			
			3. a.isAfter(b)가 그 결과인 이유는?
			isAfter()메서드는 그 순간 자체를 비교하기 때문
			
			4. 시간대가 다른 서버에서 예약 확정 시각을 비교할 때 무엇을 기준으로 비교해야 하는가?
			isEqual() 그 순간 자체를 기준으로 비교해야함
	        
	         */
		
	}

}
