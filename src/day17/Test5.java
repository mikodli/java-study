package day17;

import java.util.*;

class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       int[] numbers = {40, 10, 20, 30};

	        Arrays.sort(numbers);

	        System.out.println(Arrays.toString(numbers));

	        int index = Arrays.binarySearch(numbers, 30);

	        System.out.println(index);

	        int[] copy = Arrays.copyOf(numbers, 6);

	        System.out.println(Arrays.toString(copy));

	        int[][] a = {{1, 2}, {3, 4}};
	        int[][] b = {{1, 2}, {3, 4}};

	        System.out.println(Arrays.equals(a, b));
	        System.out.println(Arrays.deepEquals(a, b));

	        // TODO:
	        // numbers 배열에서 인덱스 1부터 3 직전까지 복사해
	        // 새로운 배열을 만들고 출력하라.
	        int[] newCopy = Arrays.copyOfRange(numbers, 1, 3);
	        System.out.println(Arrays.toString(newCopy));
	        
	        /*
	        
			1. 기존 코드의 출력 5줄은?
			[10, 20, 30, 40]
			2
			[10, 20, 30, 40, 0, 0]
			false
			true
			
			2. TODO를 완성하고 추가되는 출력 1줄을 작성해라.
			[20, 30]
			
			3. Arrays.equals()와 Arrays.deepEquals()가 다른 결과를 반환하는 이유는?
			equals()는 내부 배열을 비교하는데 2차원일 시 2차원 배열 안까지 재귀적으로 들어가 비교하는것이 아닌 내부 배열의 참조값을 비교하고
			deepEquals() 는 배열을 재귀적으로 들어가 다차원 배열 안까지의 내용을 비교하기 때문
			
			* Arrays.equals()는 두 배열의 같은 인덱스에 있는 요소들을 비교합니다. 2차원 배열에서는 각 요소가 또 다른 배열 객체이기 때문에 내부 배열의 내용을 재귀적으로 비교하지 않습니다.
			반면 Arrays.deepEquals()는 중첩된 배열의 요소까지 재귀적으로 비교하므로, 다차원 배열의 실제 값들이 같은지 확인할 때 사용합니다.
			
			4. Arrays.copyOf(numbers, 6)에서 추가된 배열 공간에는 어떤 값이 들어가는가?
			0
			
			5. Arrays.binarySearch()에 정렬되지 않은 배열을 전달하면 어떤 문제가 있는가?
			결과가 보장되지 않는다. 메서드의 전제조건을 충족하지 않았음.
			
			6. binarySearch()가 값을 찾지 못했을 때 반환하는 음수의 의미를 설명해라.
			-(삽입 위치) -1
	        
	         */

	}

}
