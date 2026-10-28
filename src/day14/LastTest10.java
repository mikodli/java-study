package day14;

import java.math.BigInteger;

class LastTest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			BigInteger a =
	            new BigInteger("1000");

	        BigInteger b =
	            new BigInteger("500");

	        BigInteger c =
	            a.subtract(b);

	        a.add(b);

	        System.out.println(a);
	        System.out.println(b);
	        System.out.println(c);
	 
	        /*
	        
			1. 출력 3줄은?
			1000
			500
			500
			
			2. a.add(b)를 실행했는데 왜 a가 1500으로 바뀌지 않는가?
			BigInteger 클래스는 immutable 불변이기 때문에 a.add(b)로 참조객체 a가 참조하고있는 객체의 내용이 바뀌는게 아니라 새로운 add한 객체를 생성해 그 객체를 반환하기 때문
			
			3. BigInteger가 immutable이라는 것은 무슨 의미인가?
			객체가 생성되고 초기화 되면 객체의 내용은 변경할 수 없음
			
			4. a가 계산 결과 1500을 참조하게 하려면 어떻게 수정해야 하는가?
			a = a.add(b);
			
			5. 아래 코드가 컴파일되지 않는 이유는?
			BigInteger result = a * b;
	        BigInteger 는 기본 산술을 할 수 없기 때문에 메서드로 연산한다.
	        
	         */

	}

}
