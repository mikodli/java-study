package day14;

import java.util.Objects;

class LastTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String a = null;
	        String b = null;
	        String c = "JAVA";

	        System.out.println(
	            Objects.equals(a, b)
	        );

	        System.out.println(
	            Objects.equals(a, c)
	        );

	        String result =
	            Objects.requireNonNull(
	                c,
	                "값이 필요합니다."
	            );

	        System.out.println(result);
	        
	        /*
	        
			1. 출력 3줄은?
			true
			false
			JAVA
			
			2. Objects.equals(a, b)에서 둘 다 null인데 왜 NPE가 발생하지 않는가?
			Objects클래스의 equals 메서드는 매개변수의 null을 체크해서 처리하기 때문
			
			3. a.equals(b)와 Objects.equals(a, b)의 중요한 차이는?
			a.equals(b)는 a의 값이 null일 때 예외가 발생함
			Objects.equals(a, b) 는 a나 b가 null이여도 예외가 발생하지 않음
			
			4. 아래 코드를 실행하면 어떤 예외가 발생하는가?
	        NullPointerException
	        
	        Objects.requireNonNull(
			    null,
			    "사용자 이름 없음"
			);
	        
	        5. 위 코드에서 예외 메시지는 무엇인가?
	        사용자 이름 없음
	        
			6. requireNonNull()을 사용하는 목적은?
			null이 들어오면 안되는 부분에서 명시적으로 예외를 일으키기 위함.
	        * null을 허용하지 않는 값에 대해 가능한 이른 시점에 검증하여 문제 발생 지점을 명확하게 한다.
	        
	         */
	}

}
