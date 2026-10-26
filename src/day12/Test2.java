package day12;

class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "JAVA";
		String s2 = "JAVA";

		String s3 = new String("JAVA");
		String s4 = new String("JAVA");

		System.out.println(s1 == s2);
		//true "JAVA"는 String 리터럴로 하나의 String 인스턴스로 공유하기때문에. 참조변수 s1과 s2는 같은 참조값을 가지게 된다.
		//**********동일 문자열 리터럴이 String Pool을 통해 재사용될 수 있으므로 같은 String 객체를 참조한다.
		
		System.out.println(s1 == s3);
		//false  s1은 "JAVA"라는 String 리터럴 이고 s3는 new 를 사용해 "JAVA"라는 String 인스턴스를 새로 생성했음으로 참조값이 다름
		
		System.out.println(s1.equals(s3));
		//true String 에 equals는 참조값을 비교하는것이 아닌 실제 들어있는 값을 비교하는것으로 둘다 JAVA 로 동일
		//**********String 클래스가 Object의 equals()를 오버라이딩하여 문자열의 내용이 같은지를 비교하도록 구련했다.
		
		
		System.out.println(s3 == s4);
		//false 둘다 new String 으로 내부 "JAVA"는 동일하게 만들었지만 String 인스턴스 를 새로 만들어 참조값이 다름
		
		System.out.println(s3.equals(s4));
		//true 둘다 new String 으로 내용은 JAVA로 만들었고 equals는 참조값이 아닌 실제 내용을 비교하는것
		
		String text = "Hello";

		text.concat(" Java");

		System.out.println(text);
		//Hello Java concat는 기존 문자열 뒤에 추가하는 매서드
		
		text = text.concat(" Java");

		System.out.println(text);
		//Hello Java Java
		
	}

}
