package day6;

public class Child extends Parent {
	int number = 20;
	int age;
	
    void print() {
        System.out.println(number);
        System.out.println(this.number);
        System.out.println(super.number);
    }
    Child(){
    	
    }
    Child(String name, int age) {
        super(name);

        this.age = age;

        System.out.println("Child »ı¼ºÀÚ");
    }
}
