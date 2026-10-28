package day14;

class LastTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int number = 100;

        Integer a = number;
        int b = a;

        Integer c = Integer.valueOf(200);
        int d = c.intValue();

        int result = a + c;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(result);
        
        /*
        
		1. 출력 5줄은?
		100
		100
		200
		200
		300
		
		2. Integer a = number;에서는 어떤 변환이 발생하는가?
		Integer.valueOf(number)라는 자동 오토박싱이 이루어짐
		
		3. int b = a;에서는 어떤 변환이 발생하는가?
		int b = a.intValue(); 자동 언박싱이 이루어짐
		
		4. Integer.valueOf(200)을 직접 호출한 것을 autoboxing이라고 부르는가?
		명시적 변환
		
		5. c.intValue()와 자동 unboxing의 차이는?
		c.intValue()와 자동 unboxing은 동일하지만 표현의 차이 int d = c; 로만해도 컴파일러에서 자동으로 int d = c.intValue();로 언박싱을 해 실행함
		
		6. a + c가 가능한 이유를 컴파일러의 개념적인 처리 코드로 표현해라.
        int result = a.intValue() + c.intValue();
        
        
         */
	}

}
