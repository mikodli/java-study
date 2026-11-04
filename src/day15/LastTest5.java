package day15;

import java.text.MessageFormat;

class LastTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String pattern =
	                "회원 {0}님의 예약 인원은 {1}명이며 상태는 {2}입니다.";

	        Object[] values = {
	                "Kim",
	                3,
	                "승인대기"
	        };

	        String message =
	                MessageFormat.format(pattern, values);

	        System.out.println(message);
	        
	        /*
	        
			1. 출력 결과는?
			회원 Kim님의 예약 인원은 3명이며 상태는 승인대기입니다.
			
			2. {0}, {1}, {2}가 의미하는 것은?
			대입할 배열의 인덱스
			
			3. values[1]을 5로 변경하면 무엇이 달라지는가?
			{1}에 들어간 3이 5로 변경
			
			4. MessageFormat.format()의 반환 타입은?
	        String
	        
	         */

	}

}
