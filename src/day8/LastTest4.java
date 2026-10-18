package day8;

class Animal {
	void sound(){
		
	}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("왈왈");
	}
}

class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("미야옹");
	}
}

class LastTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A 
		//Animal a = new Dog();

		//B. 
		Dog d = new Dog();
		//Animal a = d;

		//C. 
		//Dog d = new Animal();

		//D. 
		Animal a = (Animal) new Dog();

		//E. 
		Object o = new Dog();
		
		/*
		A는 참조변수의 타입을 Animal인 부모로 하고 Dog라는 자손 객체를 생성하는것이므로 가능
		
		B는 타입이 Dog 인 d 이고 참조객체도 Dog와 Animal타입을 참조하는 변수 a = Dog객체를 참조하는 참조변수 업캐스팅이므로 자동형변환으로 가능
		
		C는 Dog라는 자식 타입으로 부모 인스턴스를 생성하는데 불가능
		왜냐하면 부모 인스턴스는 자식타입의 멤버를 다 갖고있지 않을 수 있기 때문에
		
		D는 Animal부모타입으로 참조변수를 생서하는데 자식 객체를 생성하면서 참조변수의 타입을 Animal로 형변환이 자동으로 되는데 
		그냥 표현으로 보여준거기 때문에 가능
		
		E는 Object 는 모든 클래스의 최상층의 부모로서 가능함		
		
		 */
		
	}

}
