package day18;

import java.util.*;

class LastTest2 {

    static class Reservation {

        String id;
        int people;

        Reservation(String id, int people) {
            this.id = id;
            this.people = people;
        }

        @Override
        public String toString() {
            return id + "(" + people + ")";
        }
    }

    public static void main(String[] args) {

        List<Reservation> input = Arrays.asList(
            new Reservation("R02", 4),
            new Reservation("R01", 3),
            new Reservation("R01", 5),
            new Reservation("R03", 3),
            new Reservation("R02", 1)
        );

        Set<String> reservationIds = new HashSet<>();

        List<Reservation> reservations =
                new ArrayList<>();

        // TODO 1:
        // input을 순회하면서 ID 중복 제거
        // 같은 ID는 최초 예약만 유지
        for(Reservation r : input) {
        	if(reservationIds.add(r.id)) {
        		reservations.add(r);
        	}
        }
        
        
        // TODO 2:
        // 인원 오름차순
        // 인원이 같으면 예약 ID 오름차순
        reservations.sort(
        	    Comparator.comparingInt((Reservation r) -> r.people)
        	              .thenComparing(r -> r.id)
        	);

        
        
        System.out.println(reservations);
        System.out.println(reservations.size());
    }
    
    /*
    
	1. TODO 1과 TODO 2를 직접 구현해라.
	
	
	2. 출력 2줄을 작성해라.
	[R01(3), R03(3), R02(4)]
	3
	
	3. HashSet과 ArrayList는 각각 어떤 역할을 담당하는가?
	HashSet은 중복 제거 ArrayList는 후에 정렬
	
	@Override
	public int compareTo(Reservation other) {
	
	    if (this.id.equals(other.id)) {
	        return 0;
	    }
	
	    return Integer.compare(this.people, other.people);
	}
	4. 다음처럼 compareTo()를 구현하면 왜 비교 규약에 문제가 발생할 수 있는가?
	TreeSet은 이진트리로 구조가 루트값과 비교해 왼쪽 오른쪽에 배치하는데 new Reservation("R02", 4) 처음 루트가 되고 new Reservation("R01", 3) 비교시 루트 왼쪽으로 배치가 되는데 new Reservation("R01", 5)삽입 시 R02 와 R01만 우선 비교해 R02 조건에 빠지게 되고 
	
    5. TreeSet은 새 요소를 추가할 때 기존 모든 요소와 하나씩 비교하는가? 아니면 트리의 비교 경로를 따라 탐색하는가?
     트리의 비교 경로를 따라 탐색
    
	6. 실제 서비스에서 기존 예약의 인원이 변경된다면, 단순히 객체의 people 필드만 변경해도 되는지 설명해라. 특히 TreeSet의 정렬 기준에 사용되는 필드일 때를 생각해 봐.
	TreeSet 정렬 기준에 위배가 될 수 있으므로 people필드만 변경하면 안됨
	
     */
    
}