package day13;

class LastTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 10;
		Integer b = null;

		int result1 = a + 5;

		System.out.println(result1);

		try {

		    int result2 = b + 5;

		    System.out.println(result2);

		} catch (NullPointerException e) {

		    System.out.println("NULL 연산 불가");
		}

		System.out.println("END");
		
		/*
		
		1. 전체 출력 결과는?
		15
		NULL 연산 불가
		END

		2. a + 5가 가능한 이유를 컴파일러가 개념적으로 처리하는 코드로 표현해라.
		a.intValue() + 5;
		
		3. b + 5에서 NPE가 발생하는 정확한 이유는?
		int result2 = b + 5;에서 컴파일러에서 연산시 Integer형 b를 언박싱해 int result2 = b.intValue() + 5; 로 변환하는데 b는 null이라
		null.intValue()가 되고 b는 참조하는 객체가 없어 intValue() 메서드를 갖고 있지 않기 때문에 nullPointerException이 발생함
		
		 */

	}

}
