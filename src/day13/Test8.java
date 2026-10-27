package day13;

class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = Integer.parseInt("100");
	        Integer b = Integer.valueOf("200");

	        System.out.println(a + 10);
	        System.out.println(b + 10);

	        try {

	            int c = Integer.parseInt("ABC");
	            System.out.println(c);

	        } catch (NumberFormatException e) {

	            System.out.println("숫자 변환 실패");
	        }
	        
	        /*
	        1. 전체 출력 결과
	        110
	        210
	        숫자 변환 실패

			2. parseInt("100")의 반환 타입?
			int
			
			3. valueOf("200")의 반환 타입?
			Integer
			
			4. 그런데 b + 10이 가능한 이유?
			컴파일러에서 자동으로 오토박싱이 이루어지기 때문
			
			5. "ABC"에서 발생하는 예외 타입과 이유?
			NumberFormatException
			ABC를 숫자로 변환할 수 있는 것이 아니라서
			
			
	         */

	}

}
