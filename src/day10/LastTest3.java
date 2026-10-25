package day10;

class LastTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {

		    String str = null;
		    System.out.println(str.length());

		} catch (ArithmeticException e) {

		    System.out.println("A");

		} catch (RuntimeException e) {

		    System.out.println("B");

		} catch (Exception e) {

		    System.out.println("C");
		}
		/*
		 1. 출력 결과는?
			B
		 
		 2. 실제 생성되어 발생한 예외 객체의 타입은?
			NullPointerException
		 
		 3. 왜 catch(RuntimeException e)가 그 객체를 받을 수 있는가?
			참조변수 e는 RuntimeException 타입이고 예외클래스가 부모로서 자식 예외 클래스인 NullPointerException 상속하고 있기 때문에  
		 
		 4. 왜 그 아래의 catch (Exception e) 실행되지 않는가?
		 	catch문은 순서대로 확인하는데 그 앞에 RuntimeException블록에서 이미 예외처리했기 때문
		 
		 */
		
	}

}
