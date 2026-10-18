package day8;

class LastTest8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product[] products = new Product[3];

		products[0] = new Tv();
		products[1] = new Computer();
		products[2] = new Tv();

		for (Product p : products) {
		    p.info();
		}
		
		/*
		1. 출력 결과를 순서대로 써봐.
		Tv
		Computer
		Tv
		
		2. new Product[3]을 했을 때 Product 객체가 3개 생성되는가?
		new Product[3] 했을 때 Product 배열객체가 1개 생성
		
		3. products[0] = new Tv()에서 배열에 실제로 저장되는 것은 무엇인가?
		products[0]은 Tv라는 객체를 참조하는 참조값이 저장
		
		4. Product[]에 Tv와 Computer를 같이 저장할 수 있는 이유는?
		Product는 Tv와 Computer의 부모클래스로 Tv 와 Computer 객체의 참조값을 Product타입으로 다룰 수 있고 이때 업캐스팅이 적용되기 땝문
		
		 */
		
	}

}
