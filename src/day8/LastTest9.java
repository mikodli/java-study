package day8;

class LastTest9 {

	static void check(Product p) {
		if(p instanceof Tv) {
			Tv tv = (Tv)p;
			tv.watch();
		}
	    // Tv이면 Tv로 다운캐스팅 후 watch()

		if(p instanceof Computer) {
			Computer computer = (Computer)p;
			computer.coding();
		}
	    // Computer이면 Computer로 다운캐스팅 후 coding()
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check(new Tv());
		check(new Computer());
	}

}
