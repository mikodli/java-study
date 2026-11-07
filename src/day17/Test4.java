package day17;

import java.util.*;

class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        List<String> list =
                new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        ListIterator<String> it =
                list.listIterator(list.size());

        // TODO 1:
        // 뒤에서 앞으로 순회하며 각 요소 출력
        while(it.hasPrevious()) {
        	String result = it.previous();
        	if(result.equals("B")) {
        		it.set("X");
        	}
        	System.out.println(result);
        }
        
        // TODO 2:
        // 요소가 "B"이면 "X"로 변경

        System.out.println(list);

        Vector<String> vector = new Vector<>();

        vector.add("Kim");
        vector.add("Lee");

        Enumeration<String> en =
                vector.elements();

        // TODO 3:
        // Enumeration으로 요소를 모두 출력
        while(en.hasMoreElements()) {
        	String enS = en.nextElement();
        	System.out.println(enS);
        }
        /*

		1. TODO 1~3을 완성해라.
		
		
		2. list.listIterator(list.size())로 시작하는 이유는?
		Iterator 시작 커서 위치를 리스트 맨 뒤로 설정하려고 하기 때문
		
		3. Iterator와 ListIterator의 가장 중요한 차이는?
		Iterator는 단방향 이동을 하고 List, Set 구현 클래스는 접근이 가능
		ListIterator는 양방향 이동이 가능하고 List인터페이스를 구현한 컬렉션에서만 사용 가능
		
		4. ListIterator.set()은 무엇을 변경하는가?
		마지막으로 반환한 요소를 변경하는 메서드
		
		5. Enumeration에 Iterator.remove()와 동일한 삭제 기능이 존재하는가?
		삭제기능 없음 
		Enumeration은 hasMoreElements()와 nextElement()를 사용해 순회하는 레거시 인터페이스

         */
		
	}

}
