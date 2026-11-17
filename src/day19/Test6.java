package day19;

import java.util.*;

class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   TreeMap<Integer, String> scores = new TreeMap<>();

	        scores.put(90, "Kim");
	        scores.put(70, "Lee");
	        scores.put(100, "Park");
	        scores.put(80, "Choi");

	        scores.put(90, "Hong");

	        System.out.println(scores);

	        // TODO 1: 가장 작은 Key 출력
	        System.out.println(scores.firstKey());
	        // TODO 2: 가장 큰 Key 출력
	        System.out.println(scores.lastKey());
	        // TODO 3: 85 이하의 Key 중 최댓값 출력
	        System.out.println(scores.floorKey(85));
	        
	        // TODO 4: 85 이상의 Key 중 최솟값 출력
	        System.out.println(scores.ceilingKey(85));
	        
	        // TODO 5:
	        // 70 이상 100 미만인 엔트리들을
	        // subMap()으로 조회하여 출력
	        System.out.println(scores.subMap(70, 100));
	        /*
	        
			1. TODO 1~5를 직접 구현해라.
			
			
			2. 전체 출력 6줄은?
			{70=Lee, 80=Choi, 90=Hong, 100=Park}
			70
			100
			80
			90
			{70=Lee, 80=Choi, 90=Hong}
			
			3. scores.put(90, "Hong")을 실행하면 기존 "Kim"은 어떻게 되는가?
			Kim 이 리턴되고 거기에 Hong이 들어감.
			
			4. TreeMap은 Key와 Value 중 어떤 값을 기준으로 정렬하는가?
			Key를 기준으로 정렬
			
			5. TreeMap의 Key 중복 판단 기준은 무엇인가?
			* TreeMap은 key를 비교하는 compareTo()또는 Comparator.compare()의 결과가 0이면 같은 Key로 취급한다.
			
			6. lowerKey(), floorKey(), higherKey(), ceilingKey()의 차이는?
			lowerKey(), higherKey()는 해당 값을 포함하지 않음
			floorKey(), ceilingKey()는 해당 값을 포함
			
			7. TreeMap의 일반적인 put(), get(), remove() 시간 복잡도는?
			O(log n)
			왜냐하면 자동 정렬을 하고 2진 트리로 해서 저장되기 때문에.
			
			8. HashMap과 비교했을 때 TreeMap이 유리한 대표적인 상황은?
			* 대표적인 상황은 정렬된 Key를 이용한 범위 검색
	        
	         */
		
	}

}
