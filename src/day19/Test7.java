package day19;

import java.util.*;

class Test7 {

	/*
	AI에게 다음과 같이 요청했다고 가정.
	
	예약 ID는 중복되면 안 되고, 예약 인원이 적은 순서대로 전체 예약을 출력해 줘. 인원이 같으면 예약 ID 오름차순으로 보여 줘. 중복 ID가 입력되면 최초 예약을 유지해 줘.
	
	AI가 다음 코드를 작성.
	 */

    static class Reservation implements Comparable<Reservation> {

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



		@Override
		public int compareTo(Reservation other) {
			// TODO Auto-generated method stub
			//- 인원 오름차순
			//- 인원이 같으면 예약 ID 오름차순
			
			if(this.people == other.people) {
				return this.id.compareTo(other.id);
			}
			
			return Integer.compare(this.people, other.people);
		}
		
    }

    public static void main(String[] args) {

        List<Reservation> input = Arrays.asList(
            new Reservation("R01", 3),
            new Reservation("R02", 3),
            new Reservation("R03", 5),
            new Reservation("R01", 4),
            new Reservation("R04", 2)
        );

        Map<String, Reservation> byId = new HashMap<>();

        TreeMap<Integer, Reservation> sorted =
                new TreeMap<>();

        for (Reservation r : input) {
        	if(!byId.containsKey(r.id)) {
        		byId.put(r.id, r);
        	}            
        	
            sorted.put(r.people, r);
        }

        List<Reservation> list = new ArrayList<>(byId.values());
        Collections.sort(list);
        
        
        System.out.println(byId.size());
        System.out.println(sorted.size());
        System.out.println(sorted);
        System.out.println(list);
    }
    /*
     문제점 찾기
	현재 코드에서는 예약 ID를 중복으로 저장하지 않더라도 최초 예약이 유지되지 않을 수 있고, 서로 다른 예약이 정렬용 TreeMap에서 사라질 수 있어.
	
	답할 것:
	1. byId.put(r.id, r)가 요구사항을 위반하는 이유는?
	중복 ID가 되면 최초 예약을 유지하지 않음
	최초 예약이 사라지고 다음 인원으로 변경됨
	
	2. TreeMap<Integer, Reservation>에 인원을 Key로 사용한 것이 위험한 이유는?
    인원이 같으면 하나의 예약으로 처리가 될 수 있음.
	
	3. 원본 코드의 출력 3줄을 작성해라.
	4
	4
	{2=R04(2), 3=R02(3), 4=R01(4), 5=R03(5)}
	
	4. HashMap<String, Reservation>을 사용해서 ID 중복 시 최초 예약만 유지하도록 수정해라.
	
	
	
	5. 중복 제거 후 ArrayList<Reservation>를 만들고 다음 기준으로 정렬하는 코드를 작성해라.
	   - 인원 오름차순
	   - 인원이 같으면 예약 ID 오름차순	
	   
	6. 수정 후 정렬된 예약 목록을 작성해라.
	[R04(2), R01(3), R02(3), R03(5)]
	
	7. HashMap과 TreeMap의 차이를 활용해 이번 요구사항에서 왜 자료구조의 역할을 분리하는 것이 적절한지 설명해라.
	* 중복 판단 기준과 정렬 기준이 다르므로
	
	8. 실제 데이터베이스에서 예약 ID의 유일성을 보장하려면 어떤 제약조건을 고려해야 하는가?
	DB 차원에서 PRIMARY KEY 또는 UNIQUE 제약조건을 설정 필요.
	
     */

}
