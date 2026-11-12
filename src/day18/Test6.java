package day18;

import java.util.*;

class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(90);
        scores.add(70);
        scores.add(100);
        scores.add(80);
        scores.add(60);
        scores.add(70);

        System.out.println(scores);

        // TODO 1:
        // 가장 낮은 점수 출력
        System.out.println(scores.first());

        // TODO 2:
        // 가장 높은 점수 출력
        System.out.println(scores.last());
        
        // TODO 3:
        // 85 이하에서 가장 높은 점수 출력
        System.out.println(scores.floor(85));
        
        // TODO 4:
        // 85 이상에서 가장 낮은 점수 출력
        System.out.println(scores.ceiling(85));
        
        // TODO 5:
        // 70 이상 100 미만의 점수만 출력
        // TreeSet의 범위 검색 메서드 사용
        System.out.println(scores.subSet(70, 100));
     
        /*
        
		1. TODO 1~5를 직접 구현해라.
		
		2. 전체 출력 6줄을 작성해라.
		[60, 70, 80, 90, 100]
		60
		100
		80
		90
		[70, 80, 90]
		
		3. lower()와 floor()의 차이는?
		lower(x) x 미만 중 최댓값
		floor(x) x 이하 중 최댓값
		
		4. higher()와 ceiling()의 차이는?
		higher(x) x 초과 중 최솟값
		ceiling(x) x 이상 중 최솟값
		
		5. subSet(70, 100)에서 70과 100은 각각 포함되는가?
		70이상 100 미만
		
		6. TreeSet의 추가·삭제·검색 시간 복잡도는 일반적으로 얼마인가?
		O(log n)
		
		7. 범위 검색이 필요하다면 HashSet보다 TreeSet이 적합할 수 있는 이유는?
		범위 검색 기능을 하는 메서드 subSet이 있기 때문 HashSet은 구현해야함
        
         */
        

	}

}
