package day19;

import java.util.*;

class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Map<String, String> map = new HashMap<>();

        System.out.println(map.put("R01", "Kim"));
        System.out.println(map.put("R01", "Lee"));

        map.put("R02", null);

        System.out.println(map.get("R01"));
        System.out.println(map.get("R02"));
        System.out.println(map.get("R03"));

        System.out.println(map.containsKey("R02"));
        System.out.println(map.containsKey("R03"));

        System.out.println(map.size());
        
        /*
        
		1. 전체 출력 8줄을 작성해라.
		null
		Kim
		Lee
		null
		null
		true
		false
		2
		
		2. 첫 번째 put()과 두 번째 put()의 반환값이 다른 이유는?
		put()의 리턴값은 value의 값인데 처음 R01의 put은 key가 새로운 값이므로 return할 기존 value값이 없어서 null로 반환되고
		두번째 put()에 key값을 이미 들어있는 R01을 했으므로 이미 들어가있는 value값을 리턴하고 value값을 Lee로 변경함
		
		
		3. map.get("R02")와 map.get("R03")의 반환값은 같은데, 실제로 어떤 차이가 있는가?
		get("R02")는 key R02의 value값인 null을 반환했고 
		get("R03")는 key자체가 없어 반환된 null값이다
		
		4. put()으로 동일한 Key를 다시 저장하면 내부적으로 어떤 일이 발생하는가?
		기존 value값을 반환 후 다시 저장한 value값을 넣음
		
		5. HashMap의 Key와 Value는 각각 중복을 허용하는가?
		key는 중복 허용 안함 value는 중복 허용함
		
		6. HashMap의 평균 조회 시간 복잡도가 O(1)인 이유를 해시 버킷 구조와 연결해서 설명해라.
		get으로 key의 해시값을 계산해 해시값으로 버킷 인덱스를 결정하고 접근하는 ArrayList와 비슷한 접근방식으로 O(1)이다.
        
        * HashMap은 Key의 해시값으로 버킷 위치를 계산하기 때문에 전체 요소를 순차 탐색하지 않아도 됩니다. 해시값이 적절하게 분산된다는 가정에서 조회, 추가, 삭제의 평균 시간 복잡도는 O(1)
        
         */
		
	}

}
