package day14;

class LastTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder a =
                new StringBuilder("JAVA");

        StringBuilder b = a;

        StringBuilder c =
                a.append("-SPRING")
                 .reverse();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(a == b);
        System.out.println(a == c);
        
        /*
        
		1. 출력 5줄은?
		GNIRPS-AVAJ
		GNIRPS-AVAJ
		GNIRPS-AVAJ
		
		2. a, b, c는 각각 다른 StringBuilder 객체를 참조하는가?
		같은 StringBuilder 객체를 참조하고있음
		
		3. append() 실행 후 b에서도 변경된 문자열이 보이는 이유는?
		append()메서드는 기존 StringBuilder 객체에 들어있는 내용에 append내용을 추가하는것으로 기존 객체 내용을 변경하기 때문에 같은 참조값을 갖고있는 b에서도 변경된 문자열이 보임
		
		4. reverse() 실행 후 새로운 StringBuilder 객체가 만들어지는가?
		reverse() 실행 후 자기 자신 객체의 내용을 변경 후 자기 자신의 참조값을 반환함
		
		5. 이 코드에서 String과 StringBuilder의 가장 중요한 차이는?
		String 은 immutable 불변으로 객체가 만들어지고 초기화 퇴면 그 객체의 내용은 변경할 수 없음 
		StringBuilder 는 mutable 변경 가능으로 객체가 만들어지고 초기화 되도 그 객체에 내용을 변경할 수 있음.
        
         */

	}

}
