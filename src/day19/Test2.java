package day19;

import java.util.*;

class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        List<String> requests = Arrays.asList(
                "Kim", "Lee", "Kim",
                "Park", "Lee", "Kim", "Choi"
         );

            Map<String, Integer> counts = new HashMap<>();

            // TODO 1:
            // requests를 순회하면서
            // 고객별 신청 횟수를 counts에 저장
            for(int i = 0; i < requests.size(); i++) {
            	counts.put(requests.get(i), counts.getOrDefault(requests.get(i), 0)+1);
            	
            	/*if(counts.containsKey(requests.get(i))) {
            		counts.put(requests.get(i), counts.get(requests.get(i)) + 1);
            	}else {
            		counts.put(requests.get(i), 1);
            	}*/
            }
            
            System.out.println(counts.get("Kim"));
            System.out.println(counts.get("Lee"));
            System.out.println(counts.get("Park"));
            System.out.println(counts.get("Choi"));
            System.out.println(counts.size());

            // TODO 2:
            // counts에서 신청 횟수가 2회 이상인
            // 고객의 이름만 List<String>에 저장

            List<String> repeated = new ArrayList<>();
            counts.forEach((key, value)->{
            	if(value >=2 ) {
            		repeated.add(key);
            	}            	
            });
            
            // TODO 3:
            // repeated를 이름 오름차순으로 정렬
            Collections.sort(repeated);
            
            System.out.println(repeated);
		
            /*
            
            요구사항:
		- 고객 이름이 Key, 신청 횟수가 Value다.
		- 신청 횟수가 2회 이상인 고객만 repeated에 저장한다.
		- 최종 고객 이름 목록은 오름차순으로 출력한다.
		
		
		1. TODO 1~3을 직접 구현해라.
		
		
		2. 전체 출력 6줄을 작성해라.
		3
		2
		1
		1
		4
		[Kim,Lee]
		
		3. getOrDefault()는 어떤 역할을 하는가?
		getOrDefault()는 처음들어오는값인지 이미 들어있는 값인지 확인하고 그 value값을 리턴하기때문에 counts 역할을 하도록 개발을 했음
		
		4. 고객의 신청 횟수가 기존 값에서 증가할 때 put()은 어떤 동작을 하는가?
		key가 있으면 그 key의 value를 반환하고 value값에 새로운 값을 넣어줌
		
		5. 고객별 신청 횟수를 구할 때 ArrayList만 사용하는 방식보다 HashMap이 일반적으로 유리한 이유는?
		getOrDefault() 메서드를 이용해 counts하기 쉽다.
		* HashMap은 고객 이름을 Ket로 사용해 평균 O(1)에 기존 신청 횟수를 조회 할 수 있기 때문
		
		
		6. 입력 건수가 n개일 때 고객별 집계의 평균 시간 복잡도는 얼마인가? 단, Key 해시 계산과 비교 비용은 일정하다고 가정한다.
		O(n);
		for문에서 이미 전체 건수를 순회해야 하기 때문
            
        */
            
	}

}
