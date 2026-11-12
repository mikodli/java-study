package day18;

import java.util.*;

class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        Set<Integer> set =
                new HashSet<>(Arrays.asList(10, 20, 30));

        System.out.println(
            set.addAll(Arrays.asList(20, 40))
        );

        System.out.println(set.size());

        System.out.println(
            set.remove(50)
        );

        System.out.println(
            set.contains(30)
        );

        set.retainAll(Arrays.asList(20, 40, 60));

        System.out.println(set.size());
        System.out.println(set.contains(10));
        
        /*

		1. 출력 6줄은?
		true
		4
		false
		true
		2
		false
		
		2. addAll()에 중복 요소가 포함되어 있어도 true를 반환할 수 있는 이유는?
		set에서 addAll()은 중복하지 않는 요소가 하나라도 포함되어있으면 중복하지 않는 요소를 삽입하고 true 로 반환하기 때문
		
		3. remove(50)이 반환하는 값의 의미는?
		remove(50) 50이라는 값과 동일한 것을 제거 동일한 값이 있을 경우 제거후 true 없으면 false 
		
		4. retainAll()은 어떤 역할을 하는가?
		포함하고 있는것이 있는지 확인 후 포함하지 않는 것들은 제거
		
		5. HashSet의 요소 추가·검색·삭제의 평균 시간 복잡도는?
		평균 O(1)
		
		6. HashSet의 반복 순서가 입력 순서와 같다고 가정해도 되는가?
          꼭 보장되진 않는다.
        
         */
		
	}

}
