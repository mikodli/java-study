package day20;

import java.util.*;

class Test3 {
	
	  public static void main(String[] args) {

	        List<String> source =
	            Arrays.asList("A", "B", "A");

	        List<String> dest =
	            new ArrayList<>(Arrays.asList("A", "B", "A"));	        
	        
	        // TODO 1:
	        // 위 dest 선언을 수정하여
	        // Collections.copy()가 정상 동작하도록 만들어라.

	        Collections.copy(dest, source);

	        System.out.println(dest);

	        // TODO 2:
	        // Collections.frequency()로
	        // source에 "A"가 몇 번 등장하는지 출력
	        System.out.println(Collections.frequency(source, "A"));
	        
	        
	        // TODO 3:
	        // Collections.fill()을 이용해
	        // dest의 모든 요소를 "X"로 변경
	        Collections.fill(dest, "X");
	        System.out.println(dest);
	        System.out.println(source);
	        
	        /*

			1. new ArrayList<>(3)인데 Collections.copy(dest, source)가 실패하는 이유는?
			dest 사이즈가 source의 사이즈보다 작아서
			new ArrayList<>(3)은 capacity 를 지정함
			copy를 할 때에는 size가 dest가 source의 size이상이여야 하는데 생성자로 생성시 size자체는 0으로 작기때문
			
			2. TODO 1~3을 구현해라.
			
			
			3. 수정 후 출력 4줄은?
			[A, B, A]
			2
			[X, X, X]
			[A, B, A]
			
			4. ArrayList의 size와 capacity는 각각 무엇인가?
			size는 실질적으로 들어있는 크기 
			capacity는 넣을 수 있는 용량
			
			5. Collections.copy()는 요소를 추가하는가, 기존 요소를 교체하는가?
			기존 요소를 교체함
			
			6. Collections.fill(dest, "X")가 source에도 영향을 주는가? 이유는?
			영향을 주지 않음 
			깊은 복사이기 때문에 객체의 내용을 복사하며 새로운 객체로 만들고 내부에 있는 객체들도 복사해 새로운 객체로 만들기 때문
			
			7. Collections.copy()는 요소 객체까지 깊게 복사하는가?
			요소 객체까지 깊게 복사함
	        
	         */
	        
	    }

}
