package day17;

import java.util.*;

class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<String> reservations =
	                new ArrayList<>();

	        reservations.add("Kim");
	        reservations.add("Lee");
	        reservations.add("Park");
	        reservations.add("Choi");

	        Iterator<String> it =
	                reservations.iterator();

	        while (it.hasNext()) {
	        	
	            String name = it.next();

	            if ("Lee".equals(name)) {
	                it.remove();
	            }
	        }

	        System.out.println(reservations);
	        
	        
	        /*

			1. 이 코드에서 발생할 수 있는 예외는 무엇인가?
			ConcurrentModificationException
			
			2. 예외가 발생하는 원인을 Iterator의 동작과 연결해서 설명해라.
			Iterator는 순회 과정에서 컬렉션의 구조적 변경 여부를 확인하기 때문에.
			ArrayList의 일반적인 Iterator 구현은 구조 변경 횟수와 Iterator가 알고 있는 변경 횟수를 비교함.
			reservations.remove() 시 Iterator 를 통하지 않고 구조를 변경하기 때문에 횟수가 달라서 오류가 발생.
			* Iterator.remove() 사용한다고 멀티스레드 동시 수정까지 안전해지는 것은 아님
			
			3. Iterator를 사용해 코드를 직접 수정해라. 수정된 코드 전체를 제출해.
			*
			
			4. 수정된 코드의 출력 결과는?
			[Kim, Park, Choi]
			
			5. Iterator.remove()를 next() 없이 바로 호출하면 어떤 문제가 발생하는가?
			IllegalStateException 
			remove()는 마지막 반환 요소를 삭제하는 메서드라 , 커서가 선택한 요소가 없기 때문.			
			
			6. Iterator.remove()로 삭제하면 ArrayList 내부 요소 이동 작업 자체도 사라지는가?
	        Iterator.remove()는 순회 상태를 올바르게 유지하도록 도와줌
	        ArrayList의 내부 자료구조나 삭제 시간 복잡도를 바꾸지 않음.	        
	        
	         */
		
	}

}
