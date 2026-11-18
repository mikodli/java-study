package day20;

import java.util.*;

class Test5 {

    public static void main(String[] args) {

        List<StringBuilder> original =
            new ArrayList<>();

        original.add(new StringBuilder("A"));
        original.add(new StringBuilder("B"));

        List<StringBuilder> readOnly =
            Collections.unmodifiableList(original);
        
        List<StringBuilder> snapshot =
            Collections.unmodifiableList(
                new ArrayList<>(original)
            );

        original.get(0).append("X");

        original.set(1, new StringBuilder("C"));

        System.out.println(readOnly);
        System.out.println(snapshot);

        try {
            readOnly.add(new StringBuilder("D"));
        } catch (UnsupportedOperationException e) {
            System.out.println("MODIFY_ERROR");
        }
        
        /*

		1. 출력 3줄은?
		[AX, C]
		[AX, B]
		MODIFY_ERROR
		
		2. readOnly와 snapshot의 차이를 설명해라.
		readOnly는 original이 참조하고있는 ArrayList 자체를 unmiofiiableList를 사용해 원복 객체의 뷰를 생성했고
		snapshot은 original을 복사한 새로운 ArrayList객체를 생성해 unmiofiiableList를 객체의 뷰를 생성
		
		3. original.get(0).append("X")가 두 리스트에 어떤 영향을 주는가?
		두 리스트의 0번째 객체의 new StringBuilder("A")의 StringBuilder 기존 값에 append로 X를 추가한 값을 동일하게 봄
		
		4. original.set(1, new StringBuilder("C"))는 왜 두 리스트에 서로 다른 영향을 주는가?
		original.set(1, new StringBuilder("C"))은 original 리스트 객체의 인덱스가 첫번째의 참조값을 new StringBuilder("B")에서 new StringBuilder("C")로 변경하는데
		readOnly는 original의 리스트 객체의 참조값을 복사했기 때문에 orginal과 같은 객체를 보기때문에 변경이 되지만 
		snapshot은 original의 리스트 객체의 내용을 복사해 새로운 객체를 만들었기 때문에 리스트의 내부객체의 참조값은 복사가 되었지만 리스트 객체의 참조값이 다르기때문에 변경해도 따라가지 않음
		
		*그림으로 그리면 할수 있는데 뭔가 말로 설명하기가 빡시네
		
		5. unmodifiableList()가 반환하는 컬렉션에서 add(), remove(), set()을 실행하면 어떻게 되는가?
		java.lang.UnsupportedOperationException 발생
		
		6. unmodifiableList()는 내부의 StringBuilder 객체 자체도 변경 불가능하게 만드는가?
		내부의 StringBuilder 객체 자체는 변경이 가능함 복사한 ArrayList<> 객체의 변경이 불가능함
		
		7. 원본의 이후 변경과 내부 가변 객체의 변경 모두로부터 독립된 목록이 필요하다면 어떻게 설계해야 하는가?
		List<StringBuilder> snapshot =
            Collections.unmodifiableList(
                new ArrayList<>(?)
        );
        new ArrayList로 뷰를 생성하면 서 내부 객체를 가변 객체가 아닌 불변 객체로 설계해야됨
        
        아니면 Collections.copy를 사용해야되나?
        
         */
        
    }
}