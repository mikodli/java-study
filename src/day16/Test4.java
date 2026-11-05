package day16;

import java.util.*;

class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList<String> list = new ArrayList<>();

	        list.add("A");
	        list.add("B");
	        list.add("C");

	        list.add(1, "X");
	        list.set(2, "Y");

	        System.out.println(list);
	        System.out.println(list.get(2));
	        System.out.println(list.size());

	        list.remove(1);

	        System.out.println(list);
	        
	        /*
	        
			1. 출력 4줄은?
			[A, X, Y, C]
			Y
			4
			[A, Y, C]
			
			2. add(index, element)와 set(index, element)의 차이는?
			add는 그 인덱스에 element 를 추가하는것이고 set은 그 index의 값을 element로 변경하는것
			
			3. remove(1)을 실행하면 어떤 요소가 삭제되는가?
			1번째 인덱스에 있는 X요소가 삭제
			
			4. ArrayList에 요소가 4개 있을 때 유효한 get(index)의 인덱스 범위는?
			0 ~ 3
			
			5. 중간에 요소를 삽입하면 내부 배열에서는 어떤 작업이 발생하는가?
			삽입하는 인덱스의 부분부터 뒤쪽인덱스들을 한칸씩 뒤로 복사 후 중간인덱스에 요소를 삽입
	        
	         */
		
	}

}
