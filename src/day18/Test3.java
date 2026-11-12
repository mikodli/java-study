package day18;

import java.util.*;

class Test3 {

    static class Member {

        private final String id;
        private final String name;

        Member(String id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {

        	if(this == obj) return true;
        	
        	if(!(obj instanceof Member )) return false;
        	
        	Member other = (Member)obj;
            // TODO:
            // id가 같으면 같은 회원으로 판단
        	        	
            return Objects.equals(this.id, other.id);
        }

        @Override
        public int hashCode() {

            // TODO:
            // equals()와 일관된 해시값 반환
            return Objects.hash(id);
        }
    }

    public static void main(String[] args) {

        Set<Member> members = new HashSet<>();

        System.out.println(
            members.add(new Member("user01", "Kim"))
        );

        System.out.println(
            members.add(new Member("user01", "Lee"))
        );

        System.out.println(
            members.add(new Member("user02", "Park"))
        );

        System.out.println(members.size());
    }
    
    /*

	1. equals()와 hashCode()를 직접 완성해라.

	
	2. 올바르게 구현했을 때 출력 4줄은?
	true
	false
	true
	2
	
	3. equals()가 true인 두 객체의 hashCode()는 반드시 같아야 하는가?
	equals()가 true 인 두 객체의 hashCode()는 반드시 같아야 함
	
	4. hashCode()가 같으면 equals()도 반드시 true인가?
	true가 아닐 수 있음
	
	5. equals()만 재정의하고 hashCode()를 재정의하지 않으면 어떤 문제가 발생할 수 있는가?
	equals가 true여도 hashCode가 다를 수 있음
	
	6. 회원 이름이 아닌 ID로 중복을 판단하도록 구현한 이유는?
	사람들의 이름은 같은 이름이 존재할 가능성이 있기 때문에 구분할 수 있는 특정 값으로 구분하도록 만듬
    
     */

}
