package day17;

import java.util.*;

class LastTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names =
			    new ArrayList<>(Arrays.asList(
			        "Kim", "Lee", "Park", "Choi"
			    ));

			Iterator<String> it = names.iterator();

			while (it.hasNext()) {
				String a = it.next();
				if(a.equals("Lee")) {
					it.remove();
				}
			    // TODO: Lee만 안전하게 삭제
			}

			System.out.println(names);
			
		/*
		
		1. TODO 코드를 작성해라.
		
		
		2. next()를 호출하기 전에 remove()를 호출하면 어떤 예외가 발생하는가?
		next() 호출 전 remove()호출하면 remove()는 반환한 요소를 제거하는것인데 반환한 내용이 없기 때문에IllegalStateException 발생
		
		3. Iterator.remove()가 ArrayList의 내부 요소 이동까지 없애는가?
		ArrayList의 내부 자료구조나 삭제 시간 복잡도를 바꾸지 않음.
		Iterator.remove()는 반복자의 상태를 적절하게 갱신하면서 요소를 제거하지만, ArrayList의 내부 배열에서 요소를 이동하는 작업은 그대로 발생합니다. 따라서 중간 요소 삭제의 시간 복잡도는 일반적으로 O(n)입니다.
		
		 */

	}

}
