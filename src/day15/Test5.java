package day15;

import java.text.MessageFormat;

class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String pattern =
	                "이름: {0}, 나이: {1}, 직무: {2}";

	        Object[] arguments = {
	                "Kim",
	                32,
	                "Backend Developer"
	        };

	        String result =
	                MessageFormat.format(
	                    pattern,
	                    arguments
	                );

	        System.out.println(result);
	        
	        /*
	        
			
			1. 출력 결과는?
			이름: Kim, 나이: 32, 직무: Backend Developer
			
			2. {0}, {1}, {2}는 무엇을 의미하는가?
			그거에 대입할 맞춤 순서
			전달한 배열의 인덱스
			
			3. arguments 배열의 순서를 변경하면 출력은 어떻게 달라지는가?
			순서에 따라 {0}, {1}, {2}에 들어갈 내용들이 달라짐
			
			4. MessageFormat.format()의 반환 타입은?
			String
	        
	         */

	}

}
