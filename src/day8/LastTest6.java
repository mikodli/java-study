package day8;

class LastTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Dog();
		System.out.println(a instanceof Dog);     //A
		System.out.println(a instanceof Animal);  //B
		System.out.println(a instanceof Object);  //C
		System.out.println(a instanceof Cat);  	  //D
		
		/*
		A true 참조변수 a의 타입은 Animal 이지만 참조하는 실제 객체는 Dog()이므로 Dog로 형변환이 가능 부모에서 자식으로 형변환은 다운캐스팅
		
		B true 참조변수 a의 타입은 Animal 이니까 참조타입을 Animal 로 변경하는게 가능
		
		C true Object 는 모든 클래스의 최상위 부모이므로 Object 로 형변환 가능하기때문에
		
		D false 참조변수 a의 타입은 Animal 이지만 참조하는 실제 객체는 Dog()이므로 Animal과만 관련있는 Cat으로 형변환이 불가능 하기 때문
		
		2. 객체의 실제 클래스 이름이 정확하게 같은지 검사한다.
		틀린 말 참조변수가 가리키는 객체를 타입으로 취급할 수 있는지를 검사한다가 맞는말
			
		 */

	}

}
