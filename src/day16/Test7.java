package day16;

import java.util.*;

class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  ArrayList<Integer> list = new ArrayList<>();

	        list.add(10);
	        list.add(20);
	        list.add(30);
	        list.add(40);

	        list.remove(1);

	        System.out.println(list);

	        list.remove(Integer.valueOf(30));

	        System.out.println(list);

	        System.out.println(list.size());
	        
	        /*
	        
			1. 출력 3줄은?
			[10, 30, 40]
			[10, 40]
			2
			
			2. remove(1)은 인덱스 1을 삭제하는가, 값 1을 삭제하는가?
			인덱스 1을 삭제
			
			3. remove(Integer.valueOf(30))은 무엇을 삭제하는가?
			30의 객체를 삭제
			
			4. 두 remove() 메서드의 반환 타입은 각각 무엇인가?
			remove(1) - 제네릭 E Integer remove(2) - boolean
			
			5. ArrayList<Integer>에서 오버로딩된 remove()를 사용할 때 주의해야 할 점은?
			index로 삭제할지 객체 자체를 삭제할지 정확하게 구분해서 사용해야함
	        
	         */

	}

}
