package day12;

class LastTest5 {

	static boolean isAdmin(String name) {

	    if ("admin".equals(name)) {
	        return true;
	    }

	    return false;
	}
	
	/*
	name에 null이 들어올 수도 있다.

	1. 어떤 문제가 발생할 수 있는가?
	NullPointerException 발생	
	
	2. 현재 배운 내용만 사용해서 더 안전하게 수정
	
	
	3. 왜 수정한 코드에서는 name == null이어도 문제가 발생하지 않는가?
	"admin"이라는 String 리터럴은 String 인스턴스를 생성이 되있는것으로 equals메서드를 호출 할 수 있기 때문
	
	 */
	
}
