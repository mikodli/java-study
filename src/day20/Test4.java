package day20;

import java.util.*;

class Test4 {

    public static void main(String[] args) {

        List<String> original =
            new ArrayList<>(Arrays.asList(
                "Kim", "Lee"
            ));

        // TODO 1:
        // original을 기반으로
        // 동기화된 List<String> syncList 생성
        List<String> syncList = Collections.synchronizedList(original);
        
        // TODO 2:
        // syncList에 "Park" 추가
        syncList.add("Park");
        
        original.add("Choi");

        // TODO 3:
        // syncList를 안전하게 순회할 수 있도록
        // synchronized 블록을 작성하고
        // 각 이름을 출력해라.      
        //System.out.println(syncList);
        
        synchronized(syncList) {
        	for(String st : syncList) {
        		System.out.println(st);
        	}
        }
        
        /*
        
		1. TODO 1~3을 구현해라.
		
		
		2. 출력되는 이름 4개를 순서대로 작성해라.
		Kim
		Lee
		Park
		Choi
		
		3. Collections.synchronizedList(original)은 기존 리스트를 깊게 복사하는가, 원본을 감싼 래퍼를 만드는가?
		원본을 감싼 래퍼를 만듬
		
		4. syncList에 추가한 요소가 original에서도 보이는 이유는?
		객체를 공유하는 synchronized 동기화 메서드를 사용했기 때문
		
		5. 동기화 래퍼를 사용하더라도 여러 작업을 하나로 묶거나 반복자를 사용하는 경우 추가 동기화가 필요한 이유는?
		모름
		
		6. 다른 스레드가 original을 직접 변경하면 syncList의 동기화로 보호되는가?
		모름
		
		7. Hashtable의 동기화와 Collections.synchronizedList()의 동기화는 어떤 점에서 유사한가?
		개별 메서드는 동기화로 제어가 되지만 중간에 교착상태로 데이터가 변경될 수 있음
        
         */
        
    }
}