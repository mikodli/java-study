package day13;

class LastTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer a = new StringBuffer("Java");
		StringBuffer b = a;

		a.append(" Spring");

		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);

		b.append(" Boot");

		System.out.println(a);
		System.out.println(b);
		
		/*
		1. 전체 출력 결과를 순서대로 써라.
		Java Spring
		Java Spring
		true
		Java Spring Boot
		Java Spring Boot

		2. a.append(" Spring") 후에 왜 b에서도 "Java Spring"이 보이는가?
		보임 왜냐하면 a 와 b는 같은 참조값을 갖고있고 StringBuffer의 append("") 메서드는 "" 부분을 추가한 후 새로운 객체를 만드는 것이 아닌
		a의 참조값을 변경하는 것이 아닌 참조하고 있는 객체의 내용을 변경하는 것이기 때문
		
		3. 이 상황이 String 코드와 다른 이유를 설명?
		String immutable 수정이 불가능 String 객체에서 .concat(""); 메서드는 String 객체의 내용에 ""부분을 추가한 새로운 객체를 반환하는것
		StringBuffer 의 mutable 은 수정이 가능해 append(""); 메서드는 StringBuffer의 객체의 내용을 ""부분을 추가하는것으로 수정하는것
		
		
		 */

	}

}
