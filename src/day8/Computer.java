package day8;

class Computer extends Product {
	
	Computer() {
        super(200);
    }

    @Override
    void info() {
        System.out.println("Computer");
    }

    void coding() {
        System.out.println("코딩합니다.");
    }
    
}
