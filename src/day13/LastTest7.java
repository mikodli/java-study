package day13;

class LastTest7 {

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
		System.out.println(c.equals(e));
		
		/*
		1. 다섯 줄 결과는?
		true
		false
		true
		true
		true

		2. c == d 와 c == e	가 왜 서로 다른 결과가 나오는지 설명
		-128 ~ 127
		c == d는 c와 d의 참조값을 비교하는데 Integer 타입의 참조변수 c와 d는 참조값이 다름 
		c == e연산은 c는 Integer 형 e는 int형 그래서 == 연산시 c.intValue() == e로 컴파일러에서 자동 언박싱 후 == 비교 결국 값 128 == 128 을 비교하기 때문


		 */
		
	}

}
