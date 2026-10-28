package day14;

import java.math.BigInteger;

class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 	BigInteger a = new BigInteger("100");
	        BigInteger b = new BigInteger("200");

	        BigInteger c = a.add(b);
	        
	        System.out.println(a);
	        System.out.println(b);
	        System.out.println(c);

	        a.add(b);

	        System.out.println(a);

	}

	/*
	
	1. 출력 4줄은?
	100
	200
	300
	100
	
	2. 마지막 a가 왜 300으로 바뀌지 않는가?
	BigInteger은 불변 immutable이며 a.add(b); 메서드는 a + b 한 새로운 객체를 반환
	
	3. 다음 코드는 왜 안 되는가? BigInteger c = a + b;
	BigInteger는 참조형 타입으로 그자체로는 기본 적인 산술연산이 불가능하기 때문 
	
	4. a를 실제 계산 결과 300을 참조하도록 만들려면 어떻게 작성해야 하는가?
	a = a.add(b);
	
	 */
	
}
