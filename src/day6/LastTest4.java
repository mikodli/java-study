package day6;

public class LastTest4 {
	/*
	1. 다음 각각이 오버로딩 / 오버라이딩 / 둘 다 아님 중 무엇인지 설명
	A
	class Calculator {

	    int add(int a, int b) {
	        return a + b;
	    }
	
	    int add(int a, int b, int c) {
	        return a + b + c;
	    }
	}
	메서드 오버라이딩 
	메서드의 이름이 같지만 add두개의 메개변수의 개수가 다름
	
	B
	class Parent {
	    void print() {
	        System.out.println("Parent");
	    }
	}

	class Child extends Parent {

    	@Override
	    void print() {
	        System.out.println("Child");
	    }
	}
	메서드 오버라이딩 
	상속받고있고 부모와 동일한 타입 이름 매개변수의 메서드를 상속받고있고
	자식 클래스에 print() 메서드의 내용을 재정의했음 
	
	C
	class Test {
	    int add(int a) {
	        return a;
	    }
	
	    double add(int a) {
	        return a;
	    }
	}
	둘 다 아님
	메서드 오버로딩은 반환 타입만 다르다고 컴파일러는 구분하지 못하기 때문 그래서 컴파일 에러
	 */

}
