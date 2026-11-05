package day16;

import java.util.*;

class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  	List<String> a = new ArrayList<>();
	        List<String> b = new LinkedList<>();

	        a.add("A");
	        a.add("B");

	        b.add("A");
	        b.add("B");

	        System.out.println(a == b);
	        System.out.println(a.equals(b));

	        b.set(1, "C");

	        System.out.println(a.equals(b));
	        System.out.println(a.size() == b.size());
	        
	        /*
	        
			1. 출력 4줄은?
			false
			true
			false
			true
			
			2. a == b가 false인 이유는?
			참조값을 비교함으로 false
			
			3. 서로 다른 구현 클래스인데도 a.equals(b)가 true일 수 있는 이유는?
			equals가 List인터페이스에서 오버라이딩 되어 요소들을 비교하기 때문
			* ArrayList와 LinkedList는 AbstractList 계열에서 제공하는 equals() 구현을 사용하므로 서로 다른 클래스라도 내용과 순서를 비교
			
			4. List.equals()는 요소의 순서도 비교하는가?
			List는 순서가 있는 클래스이므로 요소의 순서도 비교함
			
			5. 크기가 같다고 두 리스트의 내용도 같다고 할 수 있는가?
			아니다.
	        
	         */

	}

}
