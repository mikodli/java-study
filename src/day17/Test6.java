package day17;

import java.util.*;

class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        StringBuilder[] arr = {
            new StringBuilder("A"),
            new StringBuilder("B")
        };

        List<StringBuilder> list =
                Arrays.asList(arr);

        List<StringBuilder> copy =
                new ArrayList<>(list);

        list.get(0).append("X");

        System.out.println(arr[0]);
        System.out.println(copy.get(0));

        list.set(1, new StringBuilder("C"));

        System.out.println(arr[1]);
        System.out.println(copy.get(1));

        list.add(new StringBuilder("D"));
        
        /*

		1. 예외 발생 전 출력 4줄은?
		AX
		AX
		C
		B
		* 틀렸는데 이 부분 전체적으로 그림적으로 설명해줘
		
		2. 마지막 줄에서 발생하는 예외는?
		UnsupportedOperationException
		
		3. Arrays.asList()가 반환하는 리스트에 set()은 가능하지만 add()는 불가능한 이유는?
		asList()는 원본 배열을 기반으로 하는 고정 크기 리스트 뷰이고 set으로 내용변경은 가능하지만 add와 remove처럼 크기를 변경하는 작업은 불가능함.
		
		4. copy는 새로운 ArrayList 객체인데도 첫 번째 StringBuilder의 변경을 확인할 수 있는 이유는?
		원본 배열을 기반으로 하기 때문, 참조값을 복사하기 때문
		
		5. 마지막 줄의 예외를 해결하면서 요소 추가가 가능한 리스트를 얻으려면 코드를 어떻게 변경해야 하는가?
		List<StringBuilder> list = new ArrayList<>(Arrays.asList(arr));
		
		6. 원본과 복사본의 가변 요소 객체까지 서로 독립적으로 만들려면 어떤 복사가 필요한가?
          깊은 복사
        
         */
		
	}

}
