package day10;

class ExceptionTest {



    static void divide(int a, int b) {

        if (b == 0) {
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }

        System.out.println(a / b);
    }

    public static void main(String[] args) {

        try {
            divide(10, 2);
            divide(10, 0);

            System.out.println("try 끝");

        } catch (IllegalArgumentException e) {
            System.out.println("예외 발생");
            System.out.println(e.getMessage());
        }

        System.out.println("프로그램 종료");
    }

/*
	1. 출력 순서
	5
	예외 발생
	0으로 나눌 수 없습니다.
	
	2. new IllegalArgumentException(...)의 역할
	IllegalArgumentException인 예외 클래스 객체를 생성
	
	3. throw의 역할
	IllegalArgumentException 예외를 발생시킴
	
	4. "try 끝"이 출력되는지 + 이유
	출력 X
	divide(10,0); 에서 예외 발생해서 그지점 이후의 try 블록 코드는 실행되지 않고 일치하는 catch를 찾는다.
	
	5. catch (... e)의 e에는 무엇이 들어오는지
	e에는 new IllegalArgumentException("0으로 나눌 수 없습니다."); 생성된 예외 객체를 가리키는 참조값이 들어옴
	
	6. catch (RuntimeException e)로 바꿔도 잡히는지 + 상속/다형성과 연결해서 이유
	catch 의 참조변수 e의 타입인  RuntimeException은 IllegalArgumentException 부모 클래스이므로 다형성으로 타입은 부모로 선언하고 객체는 자식인 IllegalArgumentException 생성가능

	 */
	
}
