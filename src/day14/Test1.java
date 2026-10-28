package day14;

import java.util.Objects;

class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    String a = null;
	        String b = null;
	        String c = "JAVA";

	        System.out.println(Objects.equals(a, b));
	        System.out.println(Objects.equals(a, c));
	        System.out.println(Objects.equals(c, "JAVA"));

	        System.out.println(c.equals("JAVA"));

	        // System.out.println(a.equals(b));
		
	        /*
	        
	        1. 출력 4줄은?
	        true
	        false
	        true
	        true
	        
			2. Objects.equals(a, b)에서 둘 다 null인데 왜 예외가 발생하지 않는가?
			Objects클래스의 equals메서드에서는  a , b null을 확인하는 코드가 있기 때문에.
			
			3. 주석을 제거해서 a.equals(b)를 실행하면 무슨 일이 발생하는가?
			NullPointerException 발생 왜냐하면 a.equals(b) 는 null.equals(null) 이고 참조변수 a의 참조값이 null이라 참조하는 객체가 없어 이스턴스 메서드 equals 메서드를 호출을 못하기 때문에.
			
			4. Objects.equals(a, b)와 a.equals(b)의 가장 중요한 차이는?
			null을 체크해 예외가 발생하는지 안하는지의 차이 Objects.equals(a ,b) 는 null을 체크하고 
			a.equals(b) 는 NullPointerException 예외가 발생함
	        
	         */
	        
	}

}
