package day6;

public class Test1 {
	 public static void main(String[] args) {
		Student student = new Student("챗지피티", 95);
		student.introduce();
		student.study();
		/*
		 1. Student 객체는 몇 개 생성했는가?
		 Student 객체는 1개 생성 student 참조변수가 참조
		 
		 2. Student 클래스에 name을 선언하지 않았는데 student.name 을 사용 할 수 있는지? 
		 Student 클래스에 Person의 클래스를 상속했기 때문
		 
		 3. super(name)과 super.introduce()의 차이는 무엇인가?
		 super(name)은 부모의 Person(String name)인 생성자를 호출함
		 super.introduce()는 부모에 있는 introduce()메서드를 호출
		 
		 4. Student.introduce()는 오버로딩인지 오버라이딩인지?
		 오버라이딩 
		 부모 자식 상속 관계에서 부모에게서 물려받은 메서드를 자식이 재정의하고 있기 때문이며
		 메서드의 명과 매개변수, 반환 타입이 같다.
		
	}
		 */
		
/*		Child c = new Child();

		System.out.println(c.name);
		System.out.println(c.age);*/
		/*
		1. Child() 생성자에는 super()가 직접 적혀 있지 않다. 그런데 부모 Parent() 생성자는 실행될까?
		실행된다.
		2. 실행된다면 왜 실행되는가?
		실행되는 이유는 Child() 자식 생성자에서 this(...), super(...)가 호출되지 않으면 컴파일러가 자동으로 자식 생성자 맨 철줄에 super(); 호출하기 때문 
		3. c.name을 사용할 수 있는 이유는 super() 때문인가, extends Parent 때문인가?
		c.name을 사용 할 수 있는 이유는 extends Parent 때문에 사용이 가능
		4. 최종 출력값 두 개는?
		부모
		20
		 */
	}
}
