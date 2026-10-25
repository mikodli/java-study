package day10;

class LastTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

		    throw new IllegalArgumentException("잘못된 값");

		} catch (IllegalArgumentException e) {

		    System.out.println(e.getMessage());
		}
		/*
		1.new IllegalArgumentException("잘못된 값") 의 역할은?
		예외 클래스 IllegalArgumentException의 객체를 생성함
		
		2. throw의 역할은?
		예외를 발생시킴
		
		3. catch의 e에는 정확히 무엇이 들어오는가?
		e에는 new IllegalArgumentException("잘못된 값") 생성한 객체의 참조값이 들어옴
		
		4. e.getMessage()가 "잘못된 값"을 반환할 수 있는 이유는?
		new IllegalArgumentException("잘못된 값") 생성한 객체가 갖고있는 메세지를 getMessage()가 출력하기 때문
		
		 */
		
	}

}
