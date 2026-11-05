package day16;

import java.util.*;

class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList<Integer> list =
	                new ArrayList<>(2);

	        list.add(10);
	        list.add(20);

	        System.out.println(list.size());

	        list.ensureCapacity(100);

	        System.out.println(list.size());

	        list.add(30);

	        System.out.println(list.size());

	        list.clear();

	        System.out.println(list.size());
	        System.out.println(list.isEmpty());
	        
	        /*
	        
			1. 출력 5줄은?
			2
			2
			3
			0
			true
			
			2. new ArrayList<>(2)에서 2가 의미하는 것은?
			용량을 2로 선언
			
			3. ensureCapacity(100)을 실행하면 size()가 100이 되는가?
			내부용량을 최소 100이상 확보하도록 요청하는 메서드 size가 변경되는 것이 아님
			
			4. clear()를 호출하면 내부 배열의 용량도 반드시 0이 되는가?
			용량은 변경되지 않고 내부 객체들만 제거
			
			5. size와 capacity의 차이는?
			size는 내부에 들어있는 객체들의 수
			capacity 는 들어갈 수 있는 용량
			
			6. ArrayList가 용량을 늘릴 때 기존 ArrayList 객체도 새로 생성되는가?
			ArrayList 객체가 생성되는 것이 아닌 내부 배열 객체가 새로 생성됨
	        
	         */
		
	}

}
