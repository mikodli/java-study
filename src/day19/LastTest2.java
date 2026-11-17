package day19;

import java.util.*;

class LastTest2 {


    static class MemberKey {

        private final String id;

        MemberKey(String id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) return true;

            if (!(obj instanceof MemberKey)) {
                return false;
            }

            MemberKey other = (MemberKey) obj;

            return Objects.equals(this.id, other.id);
        }

        @Override
        public int hashCode() {

            // 일부러 모든 객체가 같은
            // 해시값을 반환하도록 작성
            return 1;
        }
    }

    public static void main(String[] args) {

        Map<MemberKey, String> members =
                new HashMap<>();

        members.put(new MemberKey("U01"), "Kim");
        members.put(new MemberKey("U02"), "Lee");
        members.put(new MemberKey("U01"), "Park");

        System.out.println(members.size());

        System.out.println(
            members.get(new MemberKey("U01"))
        );

        TreeMap<Integer, String> reservations =
                new TreeMap<>();

        reservations.put(3, "R01");
        reservations.put(3, "R02");
        reservations.put(5, "R03");

        System.out.println(reservations.size());
        System.out.println(reservations);
    }
    
    /*
		1. 출력 4줄을 작성해라.
		2
		Park
		2
		{3=R02, 5=R03}
		
		2. MemberKey의 hashCode()가 모두 1인데도 "U01"과 "U02"를 서로 다른 Key로 저장할 수 있는 이유는?
		오버라이딩한 equals 문에서 id가 다르면 false로 리턴해주기때문
		
		3. HashMap에 해시 충돌이 발생하면 내부적으로 어떤 과정을 거쳐 정확한 Key를 찾는가? hashCode()와 equals()의 역할을 나누어 설명해라.
		그 키에 맞는 hashCode()값을 이용해 버킷을 찾고 거기서 equals()문을 통해 정확한 Key를 찾음 
		
		4. 모든 객체가 같은 해시값을 반환한다면 조회 결과의 정확성과 조회 성능에는 각각 어떤 영향이 있는가?
		정확성은 equals문에 따라서 성능이 나뉘고
		조회 성능은 여러개의 Key가 하나의 버킷에 몰리는 상황이 발생해 일일이 equals 문을 통해 구분해야됨
		
		5. TreeMap에서 reservations.put(3, "R02")를 실행했을 때 기존 "R01"이 교체되는 이유는?
		비교 메서드의 반환값이 0으로 Key를 중복을 체크 후 R01로 교체하기때문
		
		6. HashMap과 TreeMap이 Key 중복을 판단하는 기준을 각각 설명해라.
		HashMap은 hashCode()로 Key를 찾은 뒤 equals메서드를 통해 중복을 판단
		TreeMap은 compareTo()또는 Comparator.compare()의 결과가 0이면 같은 Key로 취급
		
    
     */
    
}
