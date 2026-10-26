package day12;

class LastTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = null;
		String b = "";
		
		System.out.println(b.length());
		System.out.println("JAVA".equals(a));
		System.out.println(a.equals("JAVA"));
		
		/*
		0
		false
		NullPointerException
 		* "JAVA".equals(a) 에서는 "JAVA" 는 String 인스턴스로 생성되어 .equals 메서드가 있어 가능한데 
 		 a.equals는 a의 인스턴스 객체가 생성되지 않아 객체 자체가 Null이라 NullPointerException이 발생함
 		**********
 		a에 null이 저장되어 있어 a가 어떠한 String 객체도 참조하고 있지 않으므로 인스턴스 메서드 equals()를 호출 할 수 없다.
 		 
		 */
		
	}

}
