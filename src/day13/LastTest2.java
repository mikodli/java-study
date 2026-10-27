package day13;

class LastTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("A");

		StringBuilder result =
		        sb.append("B")
		          .append("C")
		          .reverse();

		System.out.println(sb);
		System.out.println(result);
		System.out.println(sb == result);
		
		/*
		1. 세 줄의 출력 결과는?
		CBA
		CBA
		true

		2. sb == result가 그 결과인 이유는?
		sb의 참조값과 result 의 참조값이 같음 이유는 append() 메서드와 reverse() 메서드의 반환값은 StringBuilder 객체의 자신의 참조값을 반환하기때문
		
		3. 여기서 append()와 reverse()가 새로운 StringBuilder 객체를 계속 만드는 것인가?
		새로운 StringBuilder 객체를 계속 만드는 것이 아닌 두 메서드의 반환값이 객체 자신의 참조값을 반환함
		객체를 새로 만드는 것이 아닌 기존 객체의 내용을 수정
		 */

	}

}
