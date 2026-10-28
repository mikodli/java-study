package day14;

class LastTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  	User u1 = new User(100, "Kim");
	        User u2 = new User(100, "Lee");
	        User u3 = new User(200, "Kim");

	        System.out.println(u1 == u2);
	        System.out.println(u1.equals(u2));
	        System.out.println(u1.equals(u3));

	        System.out.println(
	            u1.hashCode() == u2.hashCode()
	        );
		
	}

	/*
	
	1. 출력 4줄은?
	false
	true
	false
	
	2. u1 == u2가 그 결과인 이유는?
	u1 == u2 는 참조값을 비교하는것으로 u1과 u2는 서로 다른 참조값을 갖고있기 때문
		
	3. u1.equals(u2)가 그 결과인 이유는?
	참조변수 u1이 참조하고 있는 인스턴스에서 오버라이딩 하고있는 equals 문에서 id값을 비교하고있기 때문에 u1 과 u2의 id값은 100으로 동일
	
	4. equals()가 true인 두 객체의 hashCode() 값은 어떤 관계여야 하는가?
	hashCode() int 반환값은 반드시 같아야 한다.
	
	5. 반대로 hashCode() 값이 같으면 반드시 equals()도 true인가?
	반대로는 반드시 일치할 필요 없다.
	
	 */
	
}
