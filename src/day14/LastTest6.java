package day14;

class LastTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Integer a = 127;
        Integer b = 127;

        Integer c = 128;
        Integer d = 128;

        int e = 128;

        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println(c.equals(d));
        System.out.println(c == e);
        
        /*
        
		1. 출력 4줄은?
		true
		false
		true
		true
		
		2. a == b가 그 결과인 이유는?
		Integer의 -128 ~ 127 까지는 캐시에 저장해서 재사용 하기 때문에 
		JAVA가 반드시 캐시하도록 보장하는 범위는 -128 ~ 127이며, 128은 그 보장 범위 밖이다.
		
		3. Java가 반드시 보장하는 Integer Cache의 최소 범위는?
		-128 ~ 127
		
		4. c == d가 그 결과인 이유는?
		Cache 최대 범위가 127까지라 128부터는 새로운 객체로 생성되기 때문
		
		5. c == e에서는 왜 c == d와 다른 결과가 나오는가?
		c == d는 Integer의 참조값을 비교해서 false 이지만 
		e는 int로 Integer와 int 의 연산은 Integer 를 기본형인 int로 언박싱 후 비교하기 때문에 참조값 비교가 아닌 기본형의 값 비교를 함
		c.intValue() = e;로 컴파일러에서 변경
        
         */

	}

}
