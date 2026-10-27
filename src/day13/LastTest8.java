package day13;

class LastTest8 {

	static boolean isSameCount(Integer count, int expected) {

		if(count == null) {
			return false;
		}
		
		return count == expected;
		// return count != null && count == expected;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isSameCount(10, 10));
		System.out.println(isSameCount(null, 10));
		
		/*
		
		1. 첫 번째 호출 결과는?
		true

		2. 두 번째 호출에서는 무슨 일이 발생하는가?
		예외발생 nullPointerException
		
		3. count == expected에서 ==는 Integer 객체의 참조값을 비교하는가, 숫자 값을 비교하는가? 왜?
		숫자 값을 비교 Integer는 int와의 연산이 발생하면 Integer -> int 자동 언박싱이 발생 
		count.intValue() == expected;
		
		4. null도 안전하게 처리해서 두 값이 같을 때만 true를 반환하도록 직접 수정해라.		
		
		
		 */
		
	}

}
