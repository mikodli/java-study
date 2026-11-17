package day19;

import java.util.*;

class Test3 {

	  static class MemberKey {

	        private final String id;

	        MemberKey(String id) {
	            this.id = id;
	        }

	        @Override
	        public boolean equals(Object obj) {

	            // TODO 1:
	            // id가 같으면 동일한 Key로 판단
	        	if(this == obj) return true;
	        	
	        	if(!(obj instanceof MemberKey )) return false;
	        	
	        	MemberKey other = (MemberKey)obj;
	        	
	            return Objects.equals(this.id, other.id);
	        }

	        @Override
	        public int hashCode() {

	            // TODO 2:
	            // id를 기준으로 해시값 반환
	            return Objects.hash(id);
	        }
	    }

	    public static void main(String[] args) {

	        Map<MemberKey, String> members = new HashMap<>();

	        members.put(new MemberKey("U01"), "Kim");
	        members.put(new MemberKey("U02"), "Lee");

	        members.put(new MemberKey("U01"), "Park");

	        System.out.println(members.size());

	        System.out.println(
	            members.get(new MemberKey("U01"))
	        );

	        System.out.println(
	            members.containsKey(new MemberKey("U02"))
	        );
	    }
	    
	    /*
	    
		1. equals()와 hashCode()를 직접 완성해라.
		
		
		2. 정상 구현했을 때 출력 3줄은?
		2
		Park
		true
		
		3. members.put(new MemberKey("U01"), "Park") 실행 시 어떤 일이 발생하는가?
		new MemberKey("U01")이 있는지 equals 문을 통해 확인.
		
		*
		1. 새 MemberKey("U01")의 hashCode() 계산
		2. 해시값을 이용해 버킷 위치 결정
		3. 기존 Key 후보와 equals() 등으로 동등성 검사
		4. 기존 "U01" Key가 있다고 판단되면 Value를 "Park"으로 교체
		
		
		4. MemberKey 객체를 매번 new로 생성하는데도 같은 Key로 판단할 수 있는 이유는?
		equals 문으로 id가 같은 동일한 Key로 판단하기 때문
		
		* 객체를 매번 new로 생성해도 ID가 같으면 같은 Key로 판단할 수 있는 이유는 두 객체가 동일한 ID 기반 해시값을 반환하고, equals()도 ID 기준으로 동등하다고 판단하기 때문
		
		
		5. equals()만 재정의하고 hashCode()를 재정의하지 않으면 왜 문제가 되는가?
		equals()가 true면 hashCode()도 true여야만 하는 조건이 안맞게 될 수 있기 때문에.
		
		* equals()를 재정의해서 두 객체의 논리적 동등성을 정의했다면 hashCode()도 함께 재정의해야 함. 
		* equals()가 true인 객체들은 반드시 동일한 hashCode 값을 반환해야 하며, 이 규약을 위반하면 HashMap과 HashSet에서 중복 판단이나 조회가 잘못될 수 있음.
		
		6. hashCode()가 같은 두 객체는 반드시 같은 Key인가?
		아닐 수 있음
		* 해시값이 같다는 사실만으로 두 객체가 동등하다고 판단할 수는 없습니다. 
		* 서로 다른 객체도 동일한 해시값을 가질 수 있으므로, HashMap은 해시값이 일치하는 후보에 대해 equals() 등을 이용해 실제 Key의 동등성을 판단합니다.
		
		7. 모든 MemberKey 객체가 동일한 해시값을 반환하도록 구현했다면, 조회 결과의 정확성과 성능에는 각각 어떤 영향이 있는가?
		* 모든객체가 동일한 해시값을 반환한다면 equals문을 통해 동일한 Key값을 체크할 수 있겠지만 대신 같은 해시값의 여러개의 객체들의 동등성을 일일이 비교해야되는 상황이 발생하여 성능이 느려질 수 있음.

	    
	     */
	    
}
