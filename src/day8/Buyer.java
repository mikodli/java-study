package day8;

class Buyer {
	
	private int money;
	
	Buyer(){
		money = 1000;
	}
	
	void buy(Product p){
		money -= p.price;
		p.info();
		System.out.println("남은 돈 : " + money);
	}
	
	static void check(Product p) {

		 // p가 Tv 객체로 취급 가능하면
	    // Tv로 다운캐스팅해서 watch() 호출
		if(p instanceof Tv) {
			Tv tv = (Tv)p;
			tv.watch();			
		}	   

	    // p가 Computer 객체로 취급 가능하면
	    // Computer로 다운캐스팅해서 coding() 호출
		if(p instanceof Computer) {
			Computer computer = (Computer)p;
			computer.coding();			
		}	   

		
	}

}
