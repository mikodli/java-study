package day9;

class LastTest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1. Test는 그대로 컴파일 가능한가?
		불가능 
		
		2. 불가능하다면 왜?
		implements 를 A, B둘다 받고있는데 둘다 default void print() 메서드가 있어서 
		컴파일러에서 구분을 못함

		3. 해결하도록 Test를 직접 수정해봐.
		Test 클래스에서 인터페이스 A 또는 B 둘중 하나의 print() 메서드를 반드시 오버라이딩해야된다.
		
		class Parent {
		    public void print() {
		        System.out.println("Parent");
		    }
		}
		
		interface A {
		    default void print() {
		        System.out.println("A");
		    }
		}
		
		class Child extends Parent implements A {
		
		}
		
		4. 다음 결과는?
		Child c = new Child();
		c.print();
		Parent
		
		그리고 왜 그 메서드가 선택되는지 설명.
		이렇게 상속이되고 인터페이스도 상속을 해서 다중상속할 때는 
		조상클래스에 있는 메서드를 선택하기 때문
		 */
	}

}
