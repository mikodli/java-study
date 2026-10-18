package day8;

class LastTest11 {
	static void sound(Animal a) {

	    if (a instanceof Dog) {
	        Dog d = (Dog) a;
	        d.sound();
	    }

	    if (a instanceof Cat) {
	        Cat c = (Cat) a;
	        c.sound();
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		
		1. 만약 Dog와 Cat이 둘 다 Animal.sound()를 오버라이딩하고 있다면 굳이 이렇게 할 필요가 있는지?
		
		왜나하면 sound()를 오버라이딩 하고있으면 굳이 a의 instanceof 로 확인후 다운캐스팅을 할 필요없이 
		a.sound()로 해도된다.
		왜냐하면 참조변수 a의 타입은 Animal 로 부모타입이고 
		sound() 메서드는 오버라이딩 시 참조변수 타입이 아닌 실제 객체를 따라가기 때문이다.	
		
		
		 */
		
	}

}
