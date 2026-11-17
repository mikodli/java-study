package day19;

import java.util.*;

class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Map<String, String> hashMap = new HashMap<>();

	        hashMap.put(null, "Kim");
	        hashMap.put("R01", null);

	        System.out.println(hashMap.size());

	        Hashtable<String, String> table = new Hashtable<>();

	        table.put("R01", "Lee");

	        try {
	            table.put(null, "Park");
	        } catch (NullPointerException e) {
	            System.out.println("NULL_KEY_ERROR");
	        }

	        try {
	            table.put("R02", null);
	        } catch (NullPointerException e) {
	            System.out.println("NULL_VALUE_ERROR");
	        }

	        System.out.println(table.size());
	        
	        /*
	        
		1. 전체 출력 4줄은?
		2
		NULL_KEY_ERROR
		NULL_VALUE_ERROR
		1
				
		2. HashMap은 null Key와 null Value를 각각 허용하는가?
		HahsMap은 Key에는 null이 하나만 허용
		Value에 null은 허용
		
		3. Hashtable은 null Key와 null Value를 각각 허용하는가?
		Hashtable은 Key와 Value 둘다 null을 허용하지 않음
		
		4. Hashtable의 주요 메서드에 적용되는 동기화는 어떤 의미인가?
		* 동기화 : 여러 스레드가 같은 공유 데이터에 동시에 접그할 대 실행을 조정하는 것
		
		
		5. 다음 코드가 여러 스레드 환경에서 안전하다고 단정할 수 없는 이유는?
		Hashtable 이 동기화 하기 때문
		
		* 개별 메서드가 동기화 되어 있다고 해서 여러 메서드의 조합까지 자동으로 하나의 작업처럼 보호되는것이 아니기때문
		* Check-Then-Act 경쟁 상태(Race Condition)
		
		if (!table.containsKey("R03")) {
		    table.put("R03", "Kim");
		}
		
		
		6. 신규 개발에서 Hashtable보다 HashMap을 일반적으로 선호하는 이유는? 단, 여러 스레드의 동시 접근이 필요한 상황도 구분해서 설명해라.
	    * Hashtable은 주요 메서드가 동기화된 레거시 컬렉션입니다. 
	    * 일반적인 환경에서는 동기화 비용이 없는 HashMap을 사용하고, 여러 스레드가 공유하는 Map에는 ConcurrentHashMap 등의 동시성 컬렉션을 고려합니다. 
	    * 다만 개별 메서드의 동기화만으로 복합 연산 전체의 원자성이 보장되지는 않습니다. 
	     
	         */

	}

}
