package day11;

public class LastTest1 {

	static String loadUser() {

	    try {

	        System.out.println("사용자 조회");

	        throw new RuntimeException("DB 연결 실패");

	    } catch (RuntimeException e) {

	        System.out.println("예외 기록");

	        return "FAIL";

	    } finally {

	        System.out.println("자원 정리");

	        return "SUCCESS";
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(loadUser());
		
		/*
		1. 전체 출력 결과
		사용자 조회
		예외 기록
		자원 정리
		SUCCESS

		2. 개발자는 DB 오류가 발생하면 "FAIL"을 반환하려고 했다. 실제로는 왜 "SUCCESS"가 반환되는가?
		DB오류가 발생하면 catch문으로가서 return FAIL을 반환하려 했지만 실제 메서드 반환이 완료되기 전에 finally가 실행되고 finally 블럭에 return SUCCESS가 최종 반환값을 결정한다.
		

		3. 이 코드에서 가장 문제가 되는 부분을 찾아라.
		return "SUCCESS";

		4. 어떻게 수정하는 것이 좋은가? 수정된 코드를 직접 작성해봐.
		finally {

	        System.out.println("자원 정리");

	    }
		
		 */
		
	}

}
