package day12;

class LastTest1 {
	public static void main(String[] args) {
		User u1 = new User(10, "Kim");
		User u2 = new User(10, "Lee");
		
		/*
		현재 User의 equals()는 id만 비교하고 hashCode()도 id를 반환한다.

		1. u1 == u2
		false 
		참조변수 의 참조값을 비교하는것으로 u1의 참조값은 User(10,"Kim")을 참조 u2의 참조값은 User(10, "Lee")을 참조 참조값이 다름
		
		2. u1.equals(u2)
		true 
		User의 equals 메서드는 Object에서 오버라이딩 한 것으로 id값을 비교해 id값이 같으면 true 로 반환
		
		3. u1.hashCode() == u2.hashCode()
		true
		hasCode() 메서드는 Object에서 오버라이딩 한 것으로 반환값은 id
		u1 의 id 10 u2의 id 10으로 동일
		
		4. equals()가 true인 객체들의 hashCode()가 달라도 되는가?
		java의 equals가 true 이면 hashCode의 int반환값이 같아야 한다.
		
		 */
	}

}
