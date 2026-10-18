package day8;

class Tv extends Product {

	Tv() {
        super(100);
    }

    @Override
    void info() {
        System.out.println("TV");
    }

    void watch() {
        System.out.println("TV¸¦ º¾´Ï´Ù.");
    }
	
}
