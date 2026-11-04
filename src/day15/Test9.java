package day15;

import java.time.ZonedDateTime;

class Test9 {

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
		
	        /*
	        

			1. 출력 3줄은?
			false
			true
			true
			
			2. equals()가 그 결과인 이유는?
			시간과 시간대가 다르기 때문
			
			3. isEqual()이 그 결과인 이유는?
			동일한 순간을 나타내는지 비교하기때문
			
			4. 두 값이 동일한 순간을 나타내는지 비교하려면 어떤 방법을 사용할 수 있는가?
			isEqual 또는 toInstant()로 둘다 변환 후 equals 비교
			
			5. 서로 다른 서버의 시간대를 처리할 때 이 구분이 중요한 이유는?
			다른 시간대의 사람들이 있기 때문
	        
	         */
	        
	}

}
