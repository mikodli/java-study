package day8;

class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer buyer = new Buyer();

		buyer.buy(new Tv());
		buyer.buy(new Computer());
		
		Product[] products = new Product[3];

		products[0] = new Tv();
		products[1] = new Computer();
		products[2] = new Tv();
		
		for(Product p : products) {
			p.info();
		}
		/*
		Product 타입 하나로 Tv와 Computer를 처리하는 이유
		Product 참조타입이 Tv와 Computer의 부모 타입으로 자동으로 업캐스트를 하고있기 때문에 처리가 가능		
		Tv와 Computer가 Product의 자식 클래스이므로, Tv/Computer 객체의 참조값을 Product 타입의 참조변수로 다룰 수 있고 이때 업캐스팅이 적용된다.
		
		 */
		buyer.check(new Tv());
		buyer.check(new Computer());
		
	}

}
