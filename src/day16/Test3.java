package day16;

import java.util.*;

class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> a = new ArrayList<>();

        a.add("A");
        a.add("B");

        ArrayList<String> b = new ArrayList<>();

        b.add("A");
        b.add("B");

        System.out.println(a.get(0));
        System.out.println(b.get(0));
        System.out.println(a.equals(b));

        // a.ensureCapacity(100);
        b.ensureCapacity(100);
        
        /*
		1. 출력 3줄은?
		A
		A
		true
		
		2. a와 b가 참조하는 객체의 실제 클래스는?
		ArrayList
		
		3. 주석 처리된 a.ensureCapacity(100)을 실행하면 컴파일되는가?
		컴파일 오류
		
		4. b.ensureCapacity(100)은 왜 컴파일되는가?
		ensureCapacity는 ArrayList클래스에만 있는 메서드로 List타입으로 선언한 a 는 접근하지 못하기 때문이고
		b는 ArrayList타입으로 선언했기 때문
		
		5. a와 b가 서로 다른 객체인데도 equals()가 true일 수 있는 이유는?
		List에 equals가 오버라이딩 으로 각각의 요소를 비교하기 때문
		
		6. 실무에서 List<String> a = new ArrayList<>();처럼 선언하는 장점은?
		다형성 때문으로 ArrayList외에 List를 구현하고있는 컬렉션 객체들도 다 접근이 가능하기 때문
		
         */
		
	}

}
