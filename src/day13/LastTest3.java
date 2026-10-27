package day13;

class LastTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer a = new StringBuffer("JAVA");
		StringBuffer b = new StringBuffer("JAVA");

		String x = a.toString();
		String y = b.toString();

		System.out.println(a == b);
		System.out.println(a.equals(b));

		System.out.println(x == y);
		System.out.println(x.equals(y));
		
		/*
		
		1. 네 줄의 결과를 써라.
		false
		false
		false
		true

		2. a.equals(b)와 x.equals(y)의 결과가 다른 핵심 이유는?
		참조변수 a의 참조타입은 StringBuffer이고 이 클래스는 equals를 오버라이딩 하지 않았음 그래서 Object클래스에 있는 equals메서드가 호출되고 이건 객체의 참조값을 비교하는 메서드
		참조변수 x의 참조타입은 String이고 이 클래스는 equals 를 오버라이딩 해 객체의 값을 비교하는 메서드임
		
		3. toString()을 실행했다고 해서 a 객체 자체가 String 객체로 변하는 것인가? 이유까지 설명.
		toString() 메서드는 a객체가 갖고있는 값을 String형태로 반환하는것 a의 객체를 변경하는것이 아님.
		
		 */

	}

}
