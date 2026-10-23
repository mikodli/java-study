package day11;

class LastTest6 {
	
	static void repository() throws Exception{
		//Exception 발생
		throw new Exception("DB 연결 실패");
		
	}
	
	static void serviceA() {

	    try {
	        repository();

	    } catch (Exception e) {
	        System.out.println("에러 발생");
	    }
	}
	
	static void serviceB() {

	    try {
	        repository();

	    } catch (Exception e) {

	        throw new UserServiceException(
	            "사용자 조회 실패",
	            e
	        );
	    }
	}
	
	public static void main(String[] args) {

	    serviceA();

	    System.out.println("main 계속 실행");
	    
	    
	    
	    /*
		A-1
		출력 결과는?
		에러 발생
		main 계속 실행
		
		A-2
		repository()에서 발생한 Exception은 어디에서 처리되는가?
		serviceA()메서드의 catch(Exception e)블럭에서 처리됨
		
		A-3
		serviceA()를 호출한 main()까지 그 예외가 전파되는가?
		main()까지 예외 전파하지 않음
		
		A-4
		main() 입장에서는 serviceA()가 실패했다는 사실을 예외를 통해 알 수 있는가?
		main() 메서드 입장에선 실패했다는 사실을 확인할 수 없음

		 */
	    
	    try {

	        serviceB();

	    } catch (UserServiceException e) {

	        System.out.println(e.getMessage());
	        System.out.println(e.getCause().getMessage());
	    }

	    System.out.println("main 계속 실행");
	    
	    /*
	    B-1
		출력 결과는?
		사용자 조회 실패
		DB 연결 실패
		main 계속 실행
		
		B-2
		repository()에서 최초 발생한 객체는:new Exception("DB 연결 실패")	이다.
		
		serviceB()의:catch (Exception e)	에서 e에는 정확히 무엇이 들어오는가?
		
		참조변수 e에 참조타입이 Exception 이고 repository()메서드에서 생성된 new Exception("DB 연결 실패") 예외 객체의 참조값이 들어간다.
		
		B-3
		그 다음:	new UserServiceException("사용자 조회 실패", e) 에서는 새로운 예외 객체가 생성되는가?
		new UserServiceException("사용자 조회 실패", e) 에서 UserServiceException 예외 클래스 객체가 새로 생성된다.
		
		B-4
		원래의:Exception("DB 연결 실패")	객체는 사라지는가?
		아니라면 새 UserServiceException과 어떤 관계가 되는가?
		원래의 객체 Exception은 새 UserServiceException 객체에 원인예외로 등록
		
		B-5
		main에서:	e.getMessage() 와 e.getCause().getMessage()는 각각 무엇을 출력하는가?
		e.getMessage() 는 UserServiceException 객체의 Message 사용자 조회 실패를 출력하고 
		e.getCause().getMessage() 은 getCause UserServiceException 예외 클래스의 원인예외로 등록된 Exception("DB 연결 실패")객체를 호출하고 .getMessage()는 그 객체의 
		Message를 호출함으로 DB 연결 실패
		
		B-6
		A와 B의 가장 큰 차이를 네 말로 설명해봐.
		A는 main메서드에서 serviceA() 메서드에서 발생한 예외를 확인할 수 없음
		B는 main메서드에서 serviceB() 메서드에서 발생한 예외를 확인할 수 있음 그리고 새로운 예외로 변환하면서 실제 원인 예외 정보를 보존한다.
		
		B는 service계층에서 하위계층의 예외를 의미 있는 UserServiceException으로 변환하여 호출자에게 다시 전파하고, 동시에 원본 예외를 cause로 보존한다.
		
	    */
	    
	}
	
	
}
