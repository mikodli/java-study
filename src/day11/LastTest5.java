package day11;

class LastTest5 {

	/*
	repository 계층에서 Exception("DB 연결 실패") 발생
	->
	service 계층에서는
	"사용자 조회 실패"라는 의미의 예외로 바꾸고 싶음
	->
	하지만 최초 DB 오류 정보도 버리면 안 됨
	->
	main에서 최종적으로 처리
		 */
	
	static void repository() throws Exception{
		//Exception 발생
		throw new Exception("DB 연결 실패");
		
	}
	
	static void service() throws UserServiceException{
		
		try {
			repository();
		}catch (Exception e) {
			// TODO: handle exception
			throw new UserServiceException("사용자 조회 실패", e);	
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			service();
		} catch (UserServiceException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println(e.getCause().getMessage());
		}
		
	}

}
