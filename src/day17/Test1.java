package day17;

import java.util.*;

class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Stack<Integer> stack = new Stack<>();

	        stack.push(10);
	        stack.push(20);
	        stack.push(30);

	        System.out.println(stack.pop());
	        System.out.println(stack.peek());
	        System.out.println(stack.size());
	        
	        Queue<Integer> queue = new ArrayDeque<>();

	        queue.offer(10);
	        queue.offer(20);
	        queue.offer(30);

	        System.out.println(queue.poll());
	        System.out.println(queue.peek());

	        PriorityQueue<Integer> pq =
	                new PriorityQueue<>();

	        pq.offer(30);
	        pq.offer(10);
	        pq.offer(20);

	        System.out.println(pq.poll());
	        System.out.println(pq.poll());
	        
	        /*
	        
	        1. 출력 7줄은?
	        30
			20
			2
			10
			20
			10
			20
	        
			2. pop()과 peek()의 차이는?
			pop()은 반환 후 그 인덱스의 내용을 지우는것 
			peek()은 그냥 반환만 하는것			
			
			3. poll()과 remove()는 큐가 비어 있을 때 어떻게 다르게 동작하는가?
			poll()은 큐가 비어있을 때 null 반환
			remove()는 큐가 비어있을 때 예외 발생
			
			4. PriorityQueue에서 10이 먼저 반환되는지, 30이 먼저 반환되는지 설명해라.
			10이 먼저 반환 
			우선순위 큐는 자연 정렬 순서에 따라 가장 작은 요소를 먼저 꺼내기 때문
			
			5. Java에서 신규 스택 구현 시 Stack 대신 ArrayDeque를 사용하는 이유와 방법을 설명해라.
			Stack 클래스는 Vector를 상속하는 레거시 구현이기 때문이며, Deque 는 시작, 끝 둘다 삽입 삭제가 가능한데 Stack의 조건 LIFO를 표현할 수 있기 때문에 
			
			
	        Deque<Integer> stack = new ArrayDeque<>();

			stack.push(10);
			stack.push(20);
			stack.push(30);
			
			System.out.println(stack.pop());
			System.out.println(stack.peek()); 
	        
	        
	         */
		
	}

}
