package day16;

import java.util.*;

class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        LinkedList<Integer> list = new LinkedList<>();

        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.add(40);

        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.removeFirst();

        System.out.println(list);
        
        /*
        
		1. 출력 4줄은?
		[20, 10, 30, 40]
		20
		40
		[10, 30, 40]
		
		2. addFirst()의 일반적인 시간 복잡도는?
		O(1)
		
		3. addLast()의 일반적인 시간 복잡도는?
		O(1)
		Java의 LinkedList 는 첫 노드와 마지막 노드의 참조를 모두 유지함 양끝에 직접 접근할 수 있음
		
		4. getFirst()와 get(0)의 시간 복잡도는 각각?
		getFirst() - O(1) 
		get(0) - O(1)
		
		5. Java의 LinkedList는 단일 연결 리스트인가, 이중 연결 리스트인가?
		이중 연결 리스트
		
		6. LinkedList가 맨 앞에 요소를 추가할 때 전체 요소를 이동시켜야 하는가?
		맨 앞에 요소를 추가 한 후 그 요소의 노드를 이전 맨앞 요소의 참조값으로 넣어주고 이전 맨앞 요소의 이전 노드에 추가된 맨 앞 요소의 참조값을 넣어주면됨
        
         */
		
	}

}
