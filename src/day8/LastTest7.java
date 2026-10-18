package day8;

class LastTest7 {

	static void printInfo(Product p) {
	    p.info();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printInfo(new Tv());
		printInfo(new Computer());
		/*
		1. 출력 결과는?
		TV
		Computer
		
		2. printInfo(Tv tv), printInfo(Computer computer)를 각각 만들지 않아도 되는 이유는?
		매개변수의 다형성 때문에 매개변수를 부모인 Product 타입으로 선언했고 info()메서드를 Tv와 Computer 클래스가 오버라이딩 하고있기 때문에
		
		3. printInfo() 내부의 p 타입은 Product인데 왜 Product.info()만 실행되지 않는가?
		참조변수의 타입으 Product 부모타입이지만 매개변수p에 들어오는 실제 객체는 Tv 와 Computer이고 
		오버라이딩 된 메서드는 실제 객체를 따라가기 때문이다.
		
		 */
	}

}
