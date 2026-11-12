package day18;

import java.util.*;

class Test7 {

    static class Reservation implements Comparable<Reservation> {

        String id;
        int people;

        Reservation(String id, int people) {
            this.id = id;
            this.people = people;
        }

        @Override
        public int compareTo(Reservation other) {
        	if(this.id.equals(other.id)) return 0;
        	
        	if(this.people == other.people)
        		return this.id.compareTo(other.id);
        	
            return Integer.compare(this.people, other.people);
        }

        @Override
        public String toString() {
            return id + "(" + people + ")";
        }
    }

    public static void main(String[] args) {

        Set<Reservation> reservations = new TreeSet<>();

        
        reservations.add(new Reservation("R02", 3));
        reservations.add(new Reservation("R01", 2));
        reservations.add(new Reservation("R01", 5));
        reservations.add(new Reservation("R03", 5));
        
        System.out.println(reservations);
        System.out.println(reservations.size());
    }
    
    /*
    
	    요구사항:
	- 인원 오름차순으로 정렬한다.                   
	- 인원이 같으면 예약 ID 오름차순으로 정렬한다.         
	- 서로 다른 예약 ID는 별개의 예약으로 유지한다.        
	- 동일한 예약 ID의 중복 신청은 없어야 한다.          
	- 비교 과정에서 정수 오버플로가 발생하지 않아야 한다.      
	

	1. 현재 코드에서 요구사항을 만족하지 못하는 부분을 찾아라.
	인원이 같으면 예약 ID 오름차순으로 정렬한다. 
	서로 다른 예약 ID는 별개의 예약으로 유지한다. 
	동일한 예약 ID의 중복 신청은 없어야 한다.
	비교 과정에서 정수 오버플로가 발생하지 않아야 한다.   
	
	2. 원본 코드의 출력 2줄은?
	[R01(3), R03(5)]
	2
	
	3. this.people - other.people 방식의 문제점은?
	비교 과정에서 정수 오버플로가 발생할 수 있다.
	
	4. 요구사항에 맞게 코드를 수정해라.
	
	
	5. 비교 기준이 서로 모순되지 않도록 어떤 점을 주의해야 하는가?
	객체의 타입부터 비교해야된다.
	
	6. 실제 예약 시스템에서 정렬된 예약 목록과 예약 ID의 유일성을 동시에 관리하려면 어떤 자료구조 또는 설계 방식을 고려할 수 있는가?
	아직 근데 자료구조를 안배웠는데....
    
     */

}
