package day6;

public class LastTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();

		System.out.println(user.toString());
		/*
		1. User에는 toString()을 선언하지 않았다.
		System.out.println(user.toString()); 가능한 이유 ? 
		모든 클래스는 Object클래스를 상속받고있기 때문에 User클래스에 toString()메서드를 선언하지 않아도 상속받고 있어 사용 가능
		2.User는 아무 클래스도 상속하지 않는다.
		틀린 말 
		모든 클래스는 Object클래스를 상속받고있다.
		 */
	}

}
