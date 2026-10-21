package day9;

interface A {
	default void hello() {
        System.out.println("hello");
    }

    static void test() {
        System.out.println("test");
    }
    
    default void print() {
    	System.out.println("A");
    }
    
}
