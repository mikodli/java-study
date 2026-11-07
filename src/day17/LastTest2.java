package day17;

import java.util.*;

class LastTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list =
			    new ArrayList<>(Arrays.asList("A", "B", "C"));

			ListIterator<String> it =
			    list.listIterator(list.size());

			String first = it.previous();
			it.set("X");

			System.out.println(first);
			System.out.println(list);
		
			/*
			
			1. 출력 2줄은?
			C
			[A, B, X]
			
			2. listIterator(list.size())로 시작하는 이유는?
			커서 위치를 맨뒤로 놓기 위함.
			
			3. ListIterator.set()은 어떤 요소를 변경하는가?
			마지막으로 반환한 값의 요소를 변경
			
			4. Enumeration에 요소 삭제 메서드가 존재하는가?
			요소는 순회밖에없음 삽입 삭제 변경 메서드는 없다.
			
			 */
			
	}

}
