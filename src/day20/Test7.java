package day20;

import java.util.*;

class Test7 {

    public static void main(String[] args) {

        List<String> input = Arrays.asList(
            "R01", "R02", "R01", "R03"
        );

        List<String> reservationIds =
            new ArrayList<>();

        Set<String> reservationSet = new HashSet<>();
        
        for (String id : input) {

            /*if (!reservationIds.contains(id)) {
                reservationIds.add(id);
            }*/
        	
        	if(reservationSet.add(id)) {
        		reservationSet.add(id);
        		reservationIds.add(id);
        	}
        	
        }

        List<String> readOnly =
            Collections.unmodifiableList(
                new ArrayList<>(reservationIds)
            );

        reservationIds.add("R04");

        System.out.println(readOnly);
    }
    
    /*
    
	    요구사항
	- 예약 ID 중복을 제거한다.
	- 최초 등장 순서를 유지한다.
	- 예약 ID가 많아져도 중복 검사 성능이 효율적이어야 한다.
	- 외부에 제공하는 읽기 전용 목록은 제공한 시점의 내용을 유지해야 한다.
	- 외부에서는 목록을 수정할 수 없어야 한다.
	
	1. 원본 코드의 출력은?
	[R01, R02, R03, R04]
	
	2. ArrayList.contains()를 이용한 중복 검사 방식의 성능상 문제는?
	index를 이용한 검색은 빠른데 요소를 이용한 중복검사는 리스트를 순회하며 동일한 요소가 있는지 확인하기 때문
	
	3. HashSet과 ArrayList를 함께 사용하여 최초 등장 순서를 유지하면서 중복을 제거하도록 코드를 수정해라.
	
	
	4. Collections.unmodifiableList(reservationIds)만 사용하면 요구사항을 완전히 만족하지 못하는 이유는?
	- 외부에 제공하는 읽기 전용 목록은 제공한 시점의 내용을 유지해야 한다.
	- 외부에서는 목록을 수정할 수 없어야 한다.
	두개가 만족하지 못하기때문
	내부 원본 내용이 변경되면 내용이 변경되기 때문
	
	5. 원본이 나중에 변경되어도 영향을 받지 않는 수정 불가 목록을 생성하도록 수정해라. 이번 문제의 요소는 String이야.
	
	
	6. Collections.unmodifiableList()와 Collections.synchronizedList()는 각각 무엇을 보장하는가?
	모름
	
	7. 다음 요구사항에 가장 적합한 자료구조를 각각 선택하고 이유를 설명해라.
	
	
	요구사항	선택할 자료구조
	
	
	예약 접수 순서대로 처리(FIFO)	ArrayList 순차적인 추가/삭제가 빠르고 인덱스로 인한 요소 접근이 빠르기 때문
	
	
	고객 ID 존재 여부 빠른 검사	? HashMap 
	
	
	예약 ID → 예약 객체 조회	? HashMap
	
	
	예약 날짜순 정렬 및 날짜 범위 조회	? TreeMap 
    
     */
    
    
}