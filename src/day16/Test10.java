package day16;

import java.util.*;

class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new LinkedList<>();

        for (int i = 0; i < 10000; i++) {
            a.add(i);
            b.add(i);
        }

        a.get(5000);
        b.get(5000);

        a.add(0, 999);
        b.add(0, 999);

        a.remove(5000);
        b.remove(5000);
        
        /*

		1. ArrayList.get(5000)의 일반적인 시간 복잡도는?
		O(1)
		
		2. LinkedList.get(5000)의 일반적인 시간 복잡도는?
		O(n)
		
		3. ArrayList.add(0, 999)의 시간 복잡도는?
		O(n)
		
		4. LinkedList.add(0, 999)의 시간 복잡도는?
		O(1)
		
		5. 두 리스트의 remove(5000) 시간 복잡도는 각각?
		둘다 O(n)
		
		6. LinkedList에서 중간 인덱스 삽입·삭제가 일반적으로 O(n)인 이유는?
		중간 인덱스 까지 찾는데 O(n) 삽입하는데 O(1) 이므로 O(n) + O(1) = O(n)
		
		7. O(n)과 O(1)은 실제 실행 시간이 각각 n초와 1초라는 뜻인가?
		O(1)은 데이터 수와 관계없이 일정한 작업량
		O(n)은 데이터수에 비례해 작업량이 증가
        
         */

	}

}
