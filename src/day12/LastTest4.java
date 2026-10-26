package day12;

class LastTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object a = new String("JAVA");
		Object b = new String("JAVA");

		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		/*
		1. 각각 결과
		false
		true

		2. a의 참조변수 타입은?
		Object

		3. a가 실제로 참조하는 객체 타입은?
		String		

		4. a.equals(b)에서 Object의 기본 equals()가 아니라 String의 equals()가 실행되는 이유는?
		equals메서드는 String 에서 오버라이딩을 했고 오버라이딩 메서드는 실제 참조하는 객체타입에 따라가기 때문		
		*************
		equals()는 인스턴스 메서드이고 String 에서 오버라이딩 되어있다. 오버라이딩된 인스턴스 메서드는 런타임의 실제 객체 타입을 기준으로 동적 디스패치되므로 String의 equals()가 실행된다.
		
		 */

	}

}
