package day8;

class Child extends Parent{

	  int value = 20;
	  int x = 20;

	    @Override
	    void print() {
	        System.out.println("Child print");
	    }

	    void childMethod() {
	        System.out.println("Child Method");
	    }
	    
	    @Override
	    void show() {
	        System.out.println(value);
	        System.out.println(super.value);
	    }
	    
}
