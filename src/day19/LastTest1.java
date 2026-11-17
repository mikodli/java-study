package day19;

import java.util.*;

class LastTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Map<String, Integer> counts = new HashMap<>();

	        counts.put("Kim", 3);
	        counts.put("Lee", 2);

	        Set<String> keys = counts.keySet();

	        Set<String> copy =
	                new HashSet<>(counts.keySet());

	        // TODO 1:
	        // entrySet()을 이용하여
	        // Kim의 신청 횟수를 5로 변경
	        for(Map.Entry<String, Integer> entry : counts.entrySet()) {
	        	if(entry.getKey().equals("Kim")) {
	        		entry.setValue(5);
	        	}
	        }
	        
	        
	        counts.put("Park", 1);

	        System.out.println(counts.get("Kim"));

	        System.out.println(keys.contains("Park"));

	        System.out.println(copy.contains("Park"));

	        System.out.println(keys.size());

	        System.out.println(copy.size());
	        
	        /*
	        
		1. TODO 1을 Map.Entry와 setValue()를 사용해 구현해라.
		
		
		2. 출력 5줄을 작성해라.
		5
		true
		false
		3
		2
		
		
		3. Map.Entry<K,V>는 클래스인가, 인터페이스인가? 정확히 어디에 선언되어 있는가?
		내부 인터페이스 , Map 인터페이스 내에 선언되어있음
		
		4. keys에는 Park가 반영되지만 copy에는 반영되지 않는 이유는? 컬렉션 뷰와 얕은 복사의 차이를 설명해라.
		keySet()은 Map을 기반으로 동작하는 view를 반환해서 원본 Map과 연결되어있음
		new HashSet<>(counts.keySet()); 으로 동일한 형태의 새로운 객체를 생성하는것이므로 원본 Map과 연결되어있지 않기 때문(얕은 복사)
		컬렉션 뷰는 원본을 기반으로 동작하는 View를 반환하고
		얕은 복사는 객체의 속성만 복사하고 내부는 원본 참조를 하고있음
		
		
		5. counts.get("Kim") 한 번은 평균 O(1)이지만, 다음 코드의 전체 시간 복잡도는 왜 다른지 설명해라.
		for(Map.Entry<String, Integer> entry : counts.entrySet())
		문에 의해서 전체 를 한번 순회하기때문에 O(n)
	        
	    for (String name : requests) {
		    counts.put(
		        name,
		        counts.getOrDefault(name, 0) + 1
		    );
		}
		
		단, requests에는 n개의 신청 데이터가 있고, Key의 해시 계산과 비교 비용은 일정하다고 가정해.
		
		6. 위 집계를 ArrayList만 이용해 기존 고객을 매번 순차 검색하는 방식으로 구현한다면, 전체 신청 n건과 서로 다른 고객 k명에 대해 시간 복잡도가 어떻게 달라지는가?
	    O(n) * O(k)
	    
	        
	    */

	}

}
