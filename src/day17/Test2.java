package day17;

import java.util.*;

class Test2 {

	/*
	
	요구사항:
	1. 고객은 신청한 순서대로 저장한다.
	2. 동일한 고객 이름이 이미 대기 중이면 중복 신청을 거절한다.
	3. 가장 먼저 신청한 고객부터 승인한다.
	4. 대기열이 비어 있으면 "대기 없음"을 반환한다.
	5. ArrayDeque를 사용하며, Queue<String> 인터페이스 타입으로 선언한다.
	
	 */
	
    static void apply(Queue<String> queue, String name) {

    	/*if(queue.isEmpty()) {
    		queue.offer(name);
    		return;
    	}*/
    	
    	if(!queue.contains(name)) {
			queue.offer(name);
		}		   	
    	// 대기열이 비어있으면 contains는 false 를 리턴하기 때문에 isEmpty 체크할 필요가 없음
    }

    static String approve(Queue<String> queue) {

    	if(queue.isEmpty()) {
    		return "대기 없음";
    	}

        return queue.poll();
    }

    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>();

        apply(queue, "Kim");
        apply(queue, "Lee");
        apply(queue, "Kim");
        apply(queue, "Park");

        System.out.println(queue);

        System.out.println(approve(queue));
        System.out.println(approve(queue));
        System.out.println(approve(queue));
        System.out.println(approve(queue));

        System.out.println(queue);
    }

    /*
    
		1. apply()와 approve()를 완성해라.
		
		2. 중복 신청을 어떤 방식으로 확인했는가?
		contains 메서드로 중복 신청을 확인 함
		
		3. offer(), poll(), peek()의 차이는?
		offer() 맨 뒤에 삽입
		poll() 맨 앞에 내용 삭제후 그 값을 반환
		peek() 맨 앞 내용 반환 
		
		4. 이 대기열에 ArrayList.remove(0)을 사용하는 것보다 ArrayDeque가 적합한 이유는?
		ArrayList는 앞에 하나를 제거하면 그뒤에 요소들의 인덱스를 -1 처리하는 작업을 하기 때문에 속도가 느림
		
		5. 고객이 100만 명으로 증가하면 현재 중복 확인 로직의 성능을 어떻게 개선할 수 있는가?
		* ArrayDeque.contatins()는 요소를 순차적으로 비교하므로 O(n)이다. 해결방법은 HashSet사용
		
		static void apply(Queue<String> queue,Set<String> pending, String name) {
		    if (pending.add(name)) {
		        queue.offer(name);
		    }
		}
		
		static String approve(Queue<String> queue, Set<String> pending) {

		    String name = queue.poll();
		
		    if (name == null) {
		        return "대기 없음";
		    }
		
		    pending.remove(name);
		    return name;
		}
		

     */
    
}
