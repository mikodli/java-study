package day17;

import java.util.*;

class LastTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder[] arr = {
			    new StringBuilder("A"),
			    new StringBuilder("B")
			};

			List<StringBuilder> list = Arrays.asList(arr);

			List<StringBuilder> copy =
			    new ArrayList<>(list);

			list.get(0).append("X");

			list.set(1, new StringBuilder("C"));

			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(copy.get(0));
			System.out.println(copy.get(1));
			
			/*

			1. 출력 4줄은?
			AX
			C
			AX
			B
			
			2. list와 copy는 같은 내부 배열을 사용하는가?
			다른 내부배열을 사용
			
			3. list.get(0).append("X")와 list.set(1, new StringBuilder("C"))의 차이는?
			list.get(0).append("X")은 new StringBuilder("A")만들어진 객체에 X를 추가하는것 객체 자체를 바꾸는것 새로운 객체가 아님
			list.set(1, new StringBuilder("C")) 이것은 new StringBuilder("B") 이 객체 참조값에서 새로운 객체 new StringBuilder("C") 의 참조값으로 변경
			
			 */
		
	}

}
