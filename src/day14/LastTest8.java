package day14;

import java.util.Random;

class LastTest8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r1 = new Random(100);
        Random r2 = new Random(100);

        int a = r1.nextInt(50);
        int b = r2.nextInt(50);

        System.out.println(a == b);

        /*

		1. 출력 결과는?
		true
		
		2. 같은 seed를 사용했기 때문에 왜 같은 결과를 얻을 수 있는가?
		Random클래스는 의사난수로 seed가 같으면 같은 난수를 같은 순서대로 반환 함
		
		3. nextInt(50)의 가능한 최소값과 최대값은?
		0 ~ 49
		
		4. 테스트 코드에서 seed를 고정하면 어떤 장점이 있는가?
        동일한 테스트가 필요한 곳에서 동일한 값으로 동일한 결과를 얻을 수 있는지 테스트하기 좋음
        
        첫 글자   : 영문 소문자
		나머지    : 영문 소문자 또는 숫자
		전체 길이 : 6~12자
        
        5. 정규식을 작성해라.
		[a-z][a-z0-9]{5,11}
		
		6. Matcher.matches()는 무엇을 확인하는가?
		해당 문자열전체가 정규식에 일치하는지 확인.
		
		
		7. Matcher.find()는 무엇을 확인하는가?
        해당 문자열중에 정규식과 일치하는 부분이 있는지 확인.
        
         */
        
	}

}
