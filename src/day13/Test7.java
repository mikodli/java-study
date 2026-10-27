package day13;

class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer number = null;

        System.out.println(number);

        int result = number;

        System.out.println(result);
        
        /*
        1. 첫 번째 println 결과는?
        null

		2. int result = number;에서 무슨 일이 발생하는가?
		예외 발생
		
		3. 정확한 예외 타입은?
		NullPointerException
		
		4. number가 null인데
		   System.out.println(number)는 왜 가능하고
		   int result = number는 왜 문제가 되는가?
		   int result = number 는 컴파일러에서 int result = number.intValue(); 자동 언박싱 하는데
		   number가 null이라 null.intValue();처리를 하려 하기 때문
		   
		   
		   
         */

	}

}
