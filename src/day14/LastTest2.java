package day14;

class LastTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a = "JAVA";
        String b = a;

        a.concat(" SPRING");

        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);

        a = a.concat(" SPRING");

        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);
        
        /*
        
		1. 출력 6줄은?
		JAVA
		JAVA
		true
		JAVA SPRING
		JAVA
		false
		
		2. 처음 a.concat(" SPRING")을 호출했는데 a가 "JAVA SPRING"으로 바뀌지 않는 이유는?
		String 인스턴스에서 concat메서드는 기존 인스턴스 값에 concat 로 값을 추가한 새로운 객체를 생성해 그 객체를 반환하는것이지
		기존 참조변수 a의 참조값의 내용을 바꾸는것이 아니기 때문
		
		3. String이 immutable이라는 것은 무슨 의미인가?
		immutable은 불변 String 에서 객체를 생성하고 초기화 시 그 객체의 내용은 바꿀 수 없음
		
		4. a = a.concat(" SPRING") 실행 후 a와 b의 참조 관계는 어떻게 달라지는가?
		a는 기존 JAVA를 담고있는 String 객체에서 JAVA SPRING을 담고있는 새로운 String 객체를 참조하고 
		b는 기존 JAVA를 담고있는 String 객체를 참조함
		
		5. 마지막 a == b가 그 결과인 이유는?
        a의 참조값이 JAVA에서 신규 객체인 JAVA SPRING으로 바뀌었지만 
        b의 참조값은 기존 JAVA를 참조하고 있기 때문
        
         */

	}

}
