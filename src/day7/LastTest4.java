package day7;

public class LastTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1 = new User(10);

		//u1.id = 20;             
		u1.name = "GPT";        // B

		final User u2 = new User(30);

		u2.name = "ChatGPT";    // C
		//u2 = new User(40);      // D
		/*
		User클래스의 id 는 final 변수로 초기화 후 재대입이 불가능함 초기화는 User(int id)생성자로 초기화 해주고있음
		u1.id = 20; 으로 직접 대입 불가능
		final User u2 = new User(30);
		u2는 new User(30);으로 생성된 객체로 참조값이 초기화 되었음
		u2.name = "ChatGPT" 는 참조값이 아닌 객체 내부의 변수를 변경한것으로 가능한데 
		u2 = new User(40); 는 u2 의 참조값을 새로운 객체 User(40)을 생성해 재대입하는것인데 u2는 final로 선언되어 재대입이 불가능
		
		----------------------
		final class Parent {
		
		}
		
		class Child extends Parent {
		
		}
		final로 선언된 Parent는 상속이 불가능함
		
		 */
	}

}
