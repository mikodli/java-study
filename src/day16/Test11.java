package day16;

import java.util.*;

class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  ArrayList<Integer> list = new ArrayList<>(1);

	        for (int i = 0; i < 10000; i++) {
	            list.add(i);
	        }

	        System.out.println(list.size());

	        list.add(10000);

	        System.out.println(list.size());
	        
	        /*
	        
			1. 출력 2줄은?
			10000
			10001
			
			2. 내부 배열의 공간이 충분한 상태에서 add(element)의 시간 복잡도는?
			O(1)
			
			3. 내부 배열이 꽉 차서 새 배열로 복사해야 하는 단일 add()의 시간 복잡도는?
			O(n)
			
			4. 그런데도 ArrayList.add(element)를 분할상환 O(1)이라고 부르는 이유는?
			일반적인 추가는 O(1)이고, 확장 시에는 O(n)이지만, 확장이 드물게 발생하도록 용량을 증가시키므로 연속된 n번의 추가 작업에 대한 총비용이 O(n)이다. 따라서 1회당 분할상환 시간 복잡도는 O(1)이다.
			
			5. new ArrayList<>(1)에서 초기 용량 1로 설정하면 추가할 때마다 배열을 새로 생성해야 하는가?
			확장이 드물게 발생하도록 용량을 증가 시킴 추가할 때마다 배열을 새로 생성해야 되는것은 아님
			
			6. 초기 용량을 적절히 설정하면 어떤 성능상 이점이 있는가?
	         내부 배열 객체를 새로 만들어 복사하는 시간적, 메모리적 낭비를 막을 수 있음 
	        
	         */

	}

}
