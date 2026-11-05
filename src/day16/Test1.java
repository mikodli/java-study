package day16;

import java.util.*;

class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("A");

        Set<String> set = new HashSet<>();

        set.add("A");
        set.add("B");
        set.add("A");

        Map<String, Integer> map = new HashMap<>();

        map.put("A", 10);
        map.put("B", 20);
        map.put("A", 30);

        System.out.println(list.size());
        System.out.println(set.size());
        System.out.println(map.size());
        System.out.println(map.get("A"));

        /*
		1. 출력 4줄은?
		3
		2
		2
		30
		
		2. List는 중복 요소를 허용하는가?
		허용함
		
		3. Set은 중복 요소를 허용하는가?
		허용 안함
		
		4. Map.put("A", 30) 이후 기존 "A" 키의 값은 어떻게 되는가?
		A키의 value 는 10에서 30으로 변경 키값이 중복되지 않음으로
		
		5. Map은 Collection 인터페이스를 상속하는가?
		Map은 Collection 인터페이스를 상속하지 않음
		
		6. HashSet과 HashMap의 저장 순서는 보장되는가?
		HashSet과 HashMap은 저장 순서는 유지되지 않는다.
		
         */
        
	}

}
