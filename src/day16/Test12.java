package day16;

import java.util.*;

class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    List<String> reservations = new ArrayList<>();

        reservations.add("Kim");
        reservations.add("Lee");
        reservations.add("Park");

        List<String> backup = reservations;

        reservations.remove("Lee");
        reservations.add(1, "Choi");

        System.out.println(reservations);
        System.out.println(backup);
        System.out.println(reservations == backup);

        List<String> snapshot =
                new ArrayList<>(reservations);

        reservations.add("Jung");

        System.out.println(snapshot);
        System.out.println(reservations);
        System.out.println(snapshot == reservations);
        
        /*

		1. 출력 6줄은?
		[Kim, Choi, Park]
		[Kim, Choi, Park]
		true
		[Kim, Choi, Park]
		[Kim, Choi, Park, Jung]
		false
		
		2. backup은 별도의 백업 리스트인가?
		reservations 와 동일한 객체
		
		3. new ArrayList<>(reservations)는 무엇을 생성하는가?
		새로운 ArrayList객체를 생성하면서 reservations객체에 있는 내용을 가져오는것
		
		4. snapshot과 reservations는 같은 객체를 참조하는가?
		다른 객체를 참조
		
		5. snapshot에 기존 요소들의 참조값이 복사되는가, 각 요소 객체가 새로 생성되는가?
		새로운 ArrayList 객체가 생성되고, 기존 요소 객체의 참조값들이 복사
		
		6. 예약 명단처럼 조회와 순회가 많은 작업에 일반적으로 ArrayList가 적합한 이유는?
		ArrayList는 배열 형식으로 데이터 접근시 시간복잡도는 O(1)이므로 데이터 읽는데 속도가 빠르기 때문
        
         */
		
	}

}
