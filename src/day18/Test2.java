package day18;

import java.util.*;

class Test2 {

	  static class Reservation {

	        String name;
	        int people;

	        Reservation(String name, int people) {
	            this.name = name;
	            this.people = people;
	        }

	        @Override
	        public String toString() {
	            return name + "(" + people + ")";
	        }
	    }

	    public static void main(String[] args) {

	        List<Reservation> list = new ArrayList<>();

	        list.add(new Reservation("Kim", 3));
	        list.add(new Reservation("Lee", 5));
	        list.add(new Reservation("Park", 3));
	        list.add(new Reservation("Choi", 2));

	        Comparator<Reservation> desc = new Comparator<Reservation>() {
				
				@Override
				public int compare(Reservation o1, Reservation o2) {
					// TODO Auto-generated method stub
					return Integer.compare(o1.people, o2.people);
				}
			};
	        
	        // TODO 1:
	        // 인원이 적은 순서대로 정렬
	        list.sort(desc);	        
	        System.out.println(list);

	        // TODO 2:
	        // 인원이 많은 순서대로 정렬
	        // 인원이 같으면 이름 오름차순
	        Comparator<Reservation> desc2 = new Comparator<Reservation>() {
				
				@Override
				public int compare(Reservation o1, Reservation o2) {
					// TODO Auto-generated method stub
					if(o1.people == o2.people) {
						return o1.name.compareTo(o2.name);
					}
					return Integer.compare(o2.people, o1.people);
				}
			};
			list.sort(desc2);	
	        System.out.println(list);
	    }
	    
	    /*

		1. Comparator를 사용해 TODO 1, 2를 구현해라. 익명 클래스 또는 람다식 중 편한 방식으로
		
		
		2. 출력 2줄은?
		[Choi(2), Kim(3), Park(3), Lee(5)]
		[Lee(5), Kim(3), Park(3), Choi(2)]
		
		3. Comparator.compare(a, b)에서 반환값이 음수라는 것은 무엇을 의미하는가?
		a가 b보다 작다.
		* Comparator가 정의한 정렬 기준에서 a가 b보다 앞에 와야 함
		* Comparator의 compare 메서드는 정렬 기준에 따라 두 객체를 비교합니다. 음수면 첫 번째 객체가 앞, 0이면 정렬 기준상 동등, 양수면 두번째 객체가 앞에 배치됩니다.
		
		4. Reservation이 Comparable을 구현하지 않아도 Comparator로 정렬할 수 있는가?
		Comparator는 외부 비교자로 Reservation 내에서 구현하지 않아도 가능
		
		5. a.people - b.people 대신 Integer.compare()를 사용하는 편이 안전한 이유는?
		비교과정에서 정수 오버플로가 발생 할 수 있기 때문
	    
	     */

}
