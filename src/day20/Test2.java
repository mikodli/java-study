package day20;

import java.util.*;

class Test2 {

    public static void main(String[] args) {

        List<Integer> numbers =
            new ArrayList<>(Arrays.asList(
                40, 10, 30, 20
            ));

        // TODO 1:
        // Collections.sort()로 오름차순 정렬
        Collections.sort(numbers);

        System.out.println(numbers);

        // TODO 2:
        // Collections.binarySearch()로 30의 인덱스 출력
        
        System.out.println(Collections.binarySearch(numbers, 30));
        
        
        // TODO 3:
        // Collections.reverse()로 순서를 뒤집기
        Collections.reverse(numbers);
        
        System.out.println(numbers);

        // TODO 4:
        // 현재 내림차순으로 정렬된 numbers에서
        // binarySearch()를 사용하여 30을 검색
        // 내림차순 Comparator를 반드시 전달
        System.out.println(Collections.binarySearch(numbers, 10));
        
        /*
        
		1. TODO 1~4를 직접 구현해라.
		
		2. 출력 4줄은?
		[10, 20, 30, 40]
		2
		[40, 30, 20, 10]
		1
		
		3. Collections.sort()와 Collections.reverse()의 차이는?
		sort()의 default는 오름차순 
		reverse()는 지금 정렬된것의 역순
		
		4. binarySearch()를 호출하기 전에 반드시 충족해야 할 조건은?
		내림차순 정렬이 되어있어야 함
		
		5. 내림차순 리스트를 정렬 기준 없이 binarySearch()로 검색하면 왜 문제가 발생하는가?
		binarySearch()는 인덱스의 중간값을 찾아서 찾는 값이랑 비교후 크기를 비교해 크면 중간인덱스에서 뒤쪽 작으면 중간인덱스에서 앞쪽으로 또 반을 나눠서 계산하기 때문에. 
		
		
		6. Collections.binarySearch()의 일반적인 시간 복잡도는? ArrayList에서 검색한다고 가정해라.
		O(n)
		
		7. Collections.sort()와 binarySearch()는 각각 어떤 알고리즘적 역할을 수행하는가?
		sort()는 정렬
		binarySearch()는 이진 탐색
		
        
         */
    }
}