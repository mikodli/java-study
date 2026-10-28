package day14;

import java.util.Random;

class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Random r1 = new Random(100);
        Random r2 = new Random(100);

        int a1 = r1.nextInt(100);
        int a2 = r1.nextInt(100);

        int b1 = r2.nextInt(100);
        int b2 = r2.nextInt(100);

        System.out.println(a1 == b1);
        System.out.println(a2 == b2);

	}
	/*
	
		1. 두 줄 결과는?
		true
		true
		
		2. 왜 그런 결과가 나오는가?
		Random 클래스는 의사난수라 seed값이 동일하면 동일한 난수가 발생하기 때문
		
		3. nextInt(100)이 반환할 수 있는 값의 범위는?
		0 ~ 99
		0<= 값 < 100
		
		
		4. seed를 고정하는 게 테스트에서 어떤 장점이 있을까?
		동일한 테스트에서 같은 결과가 나오는지 확인이 편함
		
	 */

}
