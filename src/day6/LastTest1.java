package day6;

public class LastTest1 {
	 public static void main(String[] args) {
		 Dog dog = new Dog();

		 dog.name = "초코";
		 dog.age = 3;

		 dog.eat();
		 dog.bark();
		 
		 /*
		 1. Dog에 name과 eat()을 직접 선언하지 않았는데 사용할 수 있는 이유는?
		 extends Animal Animal을 상속받고있기 때문에 부모 클래스에 있는 멤버를 사용 가능함 
		 
		 2. new Dog()를 실행했을 때 Animal 객체와 Dog 객체가 각각 하나씩, 총 2개 생성되는가?
		 new Dog를 실행 했을 때 Dog의 객체가 생성되고 그 객체 안에 Animal과 Dog둘다 포암되어있다.
		 
		 3. dog는 무엇을 참조하고 있는가?
		 dog는 new Dog()로 생성된 Dog 객체의 참조값을 저장하는 참조 변수
		  */
	 }
}
