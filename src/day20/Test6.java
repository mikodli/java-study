package day20;

import java.util.*;

class Test6 {

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {

        List<String> original = new ArrayList<>();

        // TODO 1:
        // Collections.checkedList()를 이용해
        // String 타입만 허용하는 checked 생성

        List checked = Collections.checkedList(original, String.class);
        
        // TODO 2:
        // checked에 "Kim" 추가
        checked.add("Kim");
        
        
        try {

            // TODO 3:
            // raw List로 형변환하여
            // checked에 Integer 100을 추가 시도
        	checked.add(100);
        	
        } catch (ClassCastException e) {
            System.out.println("TYPE_ERROR");
        }

        // TODO 4:
        // Collections.singletonList()를 이용해
        // "R01" 하나만 담긴 one 생성
        List<String> one = Collections.singletonList("R01");
        
        
        try {

            // TODO 5:
            // one에 "R02" 추가 시도

        	one.add("R02");
        	
        } catch (UnsupportedOperationException e) {
            System.out.println("MODIFY_ERROR");
        }

        // TODO 6:
        // checked와 one을 각각 출력
        System.out.println(checked);
        System.out.println(one);
    }
    /*
    
	1. TODO 1~6을 직접 구현해라.
	
	
	2. 출력되는 전체 4줄은?
	TYPE_ERROR
	MODIFY_ERROR
	[Kim]
	[R01]

	
	3. Collections.checkedList()는 어떤 역할을 수행하는가?
	한 종류의 객체만 저장가능하도록 List를 설정함
	
	4. Java의 제네릭으로 List<String>을 선언했는데도 checkedList()가 필요한 상황이 있을 수 있는 이유는?
	원본 객체의 속성을 변경하는 경우가 있을 수 있기 때문
	
	5. checkedList()로 만든 래퍼를 우회해서 원본 original을 직접 수정하면 타입 검사가 항상 적용되는가?
	적용됨
	
	6. Collections.singletonList("R01")는 싱글톤 디자인 패턴과 어떤 차이가 있는가?
	싱글톤 컬렉션은 컬렉션의 요소 개수를 제어함
	싱글톤 패턴은 특정 클래스의 인스턴스 생성 개수를 제어함
	
	7. singletonList()로 생성한 컬렉션의 요소를 set()으로 교체할 수 있는가?
	변경 불가능함
    
     */
    
    
}