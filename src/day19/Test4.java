package day19;

import java.util.*;

class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Map<String, Integer> map = new HashMap<>();

	        map.put("R01", 10);
	        map.put("R02", 20);
	        map.put("R03", 30);

	        Set<String> keys = map.keySet();

	        Collection<Integer> values = map.values();

	        // TODO 1:
	        // entrySet()으로 순회하여
	        // 모든 Value의 합계를 계산
	        
	        int sum = 0;

	        // 코드 작성

	        for(Map.Entry<String, Integer> entry : map.entrySet()) {
	        	sum += entry.getValue();
	        }
	        
	        System.out.println(sum);

	        // TODO 2:
	        // entrySet()으로 순회하면서
	        // Key가 R02인 Entry의 Value를 50으로 변경
	        // Entry.setValue() 사용

	        for(Map.Entry<String, Integer> entry : map.entrySet()) {
	        	if(entry.getKey().equals("R02")) {
	        		entry.setValue(50);
	        	}
	        }
	        
	        // 코드 작성

	        System.out.println(map.get("R02"));

	        map.put("R04", 40);

	        System.out.println(keys.contains("R04"));
	        System.out.println(values.contains(40));
	        System.out.println(keys.size());
	        
	        /*
	        
			1. TODO 1, 2를 직접 구현해라.
			
			
			2. 출력 5줄은?
			60
			50
			true
			ture
			4
			
			3. keySet(), values(), entrySet()은 각각 무엇을 반환하는가?
			keySet()은 모든 요소의 Key만 'Key'형태로 묶어 Set으로 반환
			values()는 모든 요소의 value만 묶어 반환
			entrySet()은 key=value 형태로 묶어 Set으로 반환
			
			
			4. Map.Entry<K, V>는 클래스인가, 인터페이스인가?
			Map 인터페이스 내부에 선언된 중첩 인터페이스
			
			5. Map.Entry는 어디에 선언되어 있는가?
			Map 인터페이스 내부에 선언
			
			6. keys를 먼저 생성한 후 map.put("R04", 40)을 실행했는데 keys에도 R04가 반영되는 이유는?
			* 원본 Map을 기반으로 동작하는 view를 반환하기 때문
			
			7. Entry.setValue()와 map.put()은 어떤 점이 다른가?
			Entry.setValue()는 순회하는 Iterator에서 사용 가능함
	        * Entry.setValue()는 이미 존재하는 Entry의 Value를 변경하는 작업
	        * map.put()은 Key가 있으면 value를 변경하고 없으면 새 엔트리를 추가하는것
	        
	        * Map.Entry는 Map 인터페이스 내부에 선언된 중첩 인터페이스로, 하나의 Key-Value 쌍을 표현합니다. 
	        * entrySet()을 통해 엔트리들을 순회하면서 getKey(), getValue(), setValue() 등을 사용할 수 있습니다.
	        
	        
	         */

	}

}
