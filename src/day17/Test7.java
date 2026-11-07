package day17;

import java.util.*;

class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	       String[] names = {"Kim", "Lee", "Park"};

	        List<String> reservations =
	        		new ArrayList<>(Arrays.asList(names));

	        reservations.add("Choi");

	        Queue<String> waiting =
	                new ArrayDeque<>();

	        waiting.offer("Kim");
	        waiting.offer("Lee");
	        waiting.offer("Park");

	        while (!waiting.isEmpty()) {
	            System.out.println(waiting.poll());
	        }
	        
	     /*
	        
	        요구사항
		- 예약 명단은 고객이 추가되거나 삭제될 수 있어야 한다.
		- 승인 대기열은 신청 순서대로 처리해야 한다.
		- 예외 없이 정상적으로 실행되어야 한다.
		
		답할 것:
		1. 위 코드에서 요구사항에 맞지 않는 부분을 모두 찾아라.
		- 예약 명단은 고객이 추가되거나 삭제될 수 있어야 한다. 추가 삭제가 불가능함
		- 승인 대기열은 신청 순서대로 처리해야 한다. 대기열 waiting이 우선순위 큐라 순서대로 처리가 안됨
		- 예외 없이 정상적으로 실행되어야 한다. 예외 발생
		
		2. Arrays.asList()를 사용한 부분을 어떻게 수정해야 하는가?
		new ArrayList<>(Arrays.asList(names));
		
		3. 신청 순서를 유지해야 하는 대기열에 PriorityQueue가 적합하지 않은 이유는?
		PriorityQueue는 우선순위에 따라 출력 순서가 달라지기 때문.
		
		4. 올바른 자료구조를 선택해 코드 전체를 수정해라.
		
		
		5. 수정한 코드에서 예약 명단과 승인 대기열이 서로 어떤 역할을 하는지 설명해라.
		예약 명단과 승인 대기열은 서로 독릭적으로 되어있음
	        
	    */
		
	}

}
