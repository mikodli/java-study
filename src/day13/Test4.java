package day13;

class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		
		1. StringBuilder 객체 생성
		2. 초기 문자열 "Java"
		3. append()를 체이닝해서
		   "Java Spring PostgreSQL"
		   만들기
		4. 최종 문자열 출력
		5. length 출력
		
		 */
		
		StringBuilder sb = new StringBuilder("Java");
		
		sb.append(" Spring").append(" PostgreSQL");
		
		System.out.println(sb);
		System.out.println(sb.length());
		
		/*
		
		StringBuffer와 StringBuilder의
		가장 중요한 차이는 무엇인가?
		StringBuffer 동기화를 지원하고 thread-safe를 보장
		StringBuilder 는 동기화를 지원하지 않고 thread-safe도 보장하지 않음
		
		둘 중 일반적인 단일 스레드 문자열 조립에서는
		어느 것을 주로 선택하는가? 왜?
		StringBuilder 클래스는 동기화를 지원하지 않아 속도가 더 빠름
		
		 */
		
	}

}
