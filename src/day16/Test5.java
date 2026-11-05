package day16;

import java.util.*;

class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList<StringBuilder> list =
	                new ArrayList<>(1);

	        StringBuilder sb = new StringBuilder("A");

	        list.add(sb);

	        ArrayList<StringBuilder> copy = list;

	        list.add(new StringBuilder("B"));

	        sb.append("X");

	        System.out.println(list == copy);
	        System.out.println(list.size());
	        System.out.println(copy.get(0));
	        System.out.println(list.get(0) == sb);
	        
	        /*
	        
			1. 출력 4줄은?
			true
			2
			AX
			true
			
			2. 두 번째 add()에서 내부 배열이 확장되면 list의 참조값이 변경되는가?
			list의 참조값은 변경되지 않음 
			
			3. list와 copy는 서로 다른 ArrayList 객체를 참조하는가?
			같은 ArrayList 객체를 참조함
			
			4. sb.append("X")의 변경 내용이 copy.get(0)에서도 확인되는 이유는?
			StringBuilder는 가변이기 때문에 append 시 자기 객체의 내용이 변경됨
			
			5. 내부 배열 확장 시 StringBuilder 객체 자체도 복사되어 새로운 객체가 생성되는가?
			새로운 객체가 생성되는 것이 아닌 참조값을 복사하는것
			
			6. 이 예제에서 ArrayList 객체, 내부 배열 객체, StringBuilder 객체를 구분해서 설명해라.
			ArrayList 객체는 크기를 1로 설정했음으로 내부 배열 객체의 크기는 1인데 add를 두번해서 내부 배열 객체의 크기가 작기때문에 
			내부 배열 객체를 크기를 더 크게 만든 새로운 내부 배열 객체를 생성하고 그 내부 배열 객체에 기존 배열 객체에 있는 요소를 복사한 뒤 add 처리를 함
			StringBuilder 객체의 참조값을 복사해서 새로운 내부 배열 객체에 참조값을 넣어주기때문에 StringBuilder는 새로운 객체가 아니고 StringBuilder에 append 처리시 
			StringBuilder 클래스는 가변 mutable 클레스이므로 append시 자기 객체의 내용을 추가한 후 자기 자신의 참조값을 반환한는 것으로 StringBuilder의 객체도 그대로 유지가 됨
	        
	         */
		
	}

}
