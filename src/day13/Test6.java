package day13;

class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	int number = 100;

	        Integer a = number;
	        Integer b = Integer.valueOf(200);

	        int c = a;
	        int d = b.intValue();

	        System.out.println(a);
	        System.out.println(b);
	        System.out.println(c);
	        System.out.println(d);

	        Integer result = a + b;

	        System.out.println(result);
	        
	        /*
	        1. 전체 출력 결과
	        100
	        200
	        100
	        200
	        300
				
			2. Integer a = number; 여기서 무슨 변환이 발생하는가?
			오토박싱
			
			3. int c = a;
			   여기서는?
			언박식
			
			4. int d = b.intValue();
			   이것은 자동 언박싱인가 직접 언박싱인가?
			직접 언박싱
			
			5. a + b가 가능한 이유는?
			컴파일러가 연산을 위해 각각 기본형 int로 자동 언박싱 하기 때문이다.
			
			6. 컴파일러가 개념적으로 a + b를 어떻게 처리하는지 설명
			a.intValue() + b.intValue();
			
	         */

	}

}
