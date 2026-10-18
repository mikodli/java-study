package day8;

class LastTest5 {

	/*
	각 코드에 대해 컴파일 / 실행을 구분해서 설명
	A.
	Animal a = new Dog();
	Dog d = (Dog) a;
	
	컴파일 가능하고 실행도 가능
	이유는 Animal이라는 부모의 참조변수 타입으로 자손인 Dog객체를 생성했고
	a의 객체 자체는 Dog이니까 Dog d = (Dog) a;가 가능함
		
	B.
	Animal a = new Animal();
	Dog d = (Dog) a;
	컴파일은 가능 실행은 에러 에러명은 ClassCastException
	이유는 Animal이라는 부모의 참조변수 타입으로 부모인 Animal객체를 생성했고
	Dog d 는 Dog라는 자식 참조변수 타입으로 부모 객체인 Animal을 했기 때문에 객체에 Dog의 멤버가 없을 수 있기때문이다.
	
	C.
	Animal a = new Cat();
	Dog d = (Dog) a;
	컴파일 가능 실행은  러 에러명은 ClassCastException
	a의 선언타입은 Animal Dog의 부모이기 때문에 컴파일은 가능하지만 참조하는 실제 객체가 Cat이므로 
	
	
	 */
	
}
