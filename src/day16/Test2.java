package day16;

import java.util.*;

class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = new HashMap<>();

        map.put("Kim", 90);
        map.put("Lee", 80);

        Set<Map.Entry<String, Integer>> entries =
                map.entrySet();

        int sum = 0;

        for (Map.Entry<String, Integer> entry : entries) {
            sum += entry.getValue();
        }

        System.out.println(sum);
        System.out.println(entries.size());
        
        /*
		1. 출력 2줄은?
		170
		2
		
		2. Map.Entry<K, V>는 무엇을 나타내는가?
		key value 쌍을 뜻함
		
		3. map.entrySet()의 반환 타입은?
		entrySet()은 Map에 저장된 키·값 쌍을 Set 형태로 볼 수 있는 뷰를 반환
		
		4. Map을 구현하는 클래스가 Map.Entry까지 직접 implements 해야 하는가?
		Map.Entry까지 직접 구현할 필요 없음
		
		5. Map.Entry는 독립적인 최상위 인터페이스인가, Map 내부에 선언된 중첩 인터페이스인가?
		Map 내부에 선언된 중첩 인터페이스
		
         */
		
	}

}
