package day2;

public class part3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 10;

		System.out.println(a == b);
		//참조형이 아닌 기본형은 값 자체를 비교하므로 true
		
		User user1 = new User();
		User user2 = new User();

		System.out.println(user1 == user2);
		//참조변수 user1 은 new User()라는 객체의 주소를 가리키고 참조변수 user2는 new User()라는 객체의 주소를 가리키는데 두 객체의 주소는 다름 
		//참조 변수의 비교는 메모리에 있는 주소를 비교하므로 false 
		
		User user3 = new User();
		User user4 = user3;

		System.out.println(user3 == user4);
		//참조변수 user3 는 new User()라는 객체를 생성해 나온 메모리에 주소를 가리키고있고 user4는 객체를 생성하지 않고 참조변수user3가 가리키는 new User() 의 메모리에 같은 주소를 가리키고 있으므로 true
		
		User usera1 = new User();
		User usera2 = new User();
		User usera3 = usera1;

		System.out.println(usera1 == usera2);
		//false 참조변수 usera1 은 usera2와 다른 new User()라는 객체의 메모리 주소를 가리키고 있음
		System.out.println(usera1 == usera3);
		//true 참조변수 usera1는 new User()객체를 생성해 메모리 주소를 가리키고 있고 usera3은 usera1이 가리키고 있는 new User()객체의 메모리 주소를 같이 참조하고있음
		
		
	}

}
