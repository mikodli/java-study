package day1;

public class part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User();
		
		user1.name = "Lee";
		
		User user2 = user1;
		
		user2.name = "Kim";
		
		System.out.println(user1.name);
		/*User 이라는 클래스로 생성자를 만들었어 user1이라는 그럼 user1에 주소에 name이라는 참조형 변수에 Lee라는 값이 들어갔고 user1.name 은 -> Lee가 들어있는 주소를 나타내
		*그런데 user2라는 User클래스로 생성자를 신규로 만들지만 그건 user1의 주소를 가리키고 있어 User user2 = user1;으로 생성을 해서 그다음 user2.name = "Kim" 여기서 user2.name 은 user1.name 이 가리키고 있는 주소에 값을 바꿨어 그래서 둘다 
		*Kim 으로 출력된다
		*/
		System.out.println(user2.name);
		
	}

	
}
