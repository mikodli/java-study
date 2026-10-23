package day11;

class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (
			    MyResource r1 = new MyResource("A");
			    MyResource r2 = new MyResource("B")
			) {
			    System.out.println("사용");
			}
		
			/*
			1. 전체 출력 순서
			A 생성
			B 생성
			사용
			B 종료
			A 종료
			
			2. 왜 close()를 직접 호출하지 않아도 되는가?
			try - with - resources 문에서 try()안에서 생성한 객체들은 try문이 종료될 때 자동으로 close() 메서드를 실행시키기 때문에.
			
			3. AutoCloseable은 여기서 어떤 역할인가?
			close() 메서드를 구현하도록 하는 인터페이스
			
			4. 왜 B가 A보다 먼저 닫히는가?
			try-with-resources 가 자원을 역순으로 close 하도록 정의되어 있기 때문
			
			 */
	}

}
