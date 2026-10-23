package day11;

class Test5 {
	
	static void repository() throws Exception {
	    throw new Exception("DB ERROR");
	}

	static void service() {

	    try {
	        repository();

	    } catch (Exception e) {

	        throw new ServiceException(
	            "사용자 조회 실패",
	            e
	        );
	    }
	}

	public static void main(String[] args) {

	    try {
	        service();

	    } catch (ServiceException e) {

	        System.out.println(e.getMessage());
	        System.out.println(e.getCause().getMessage());
	    }
	}
	/*
	
	1. 출력 결과
	사용자 조회 실패
	DB ERROR
	
	2. 실제 최초 발생한 예외 객체 타입
	Exception("DB ERROR");
	
	3. service()에서 새로 생성하는 예외 객체 타입
	ServiceException(message , cause);
	
	4. ServiceException의 cause에는 무엇이 들어있는가? 문자열인지 참조값인지까지 정확히.
	cause 에는 new Exception("DB ERROR")로 생성한 Exception 객체의 참조값이 들어있다.
	
	5. 이것이 단순한 throw e와 다른 점은?
	여러종류의 예외를 의미있는 예외로 추상화 하고
	새로운 예외로 변화하면서도 실제 원인 예외 정보는 보존한다.
	
	 */

}
