package day3;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10, 20, 30};

		int[] b = a.clone();
		
		b[0] = 100;

		//clone은 참조변수 a의 참조값이 아닌 참조값의 데이터만 뽑아서 복사하는것 그래서 참조변수 b와는 다름걸 참조함
		//따라서 b[0]을 바꿔도 참조변수 a가 참조한 값은 변경되지 않음
		System.out.println(a[0]);
		//  10
		System.out.println(b[0]);
		// 100
		//a.clone()은 새로운 배열 객체를 생성하고 기존 배열의 각 요소를 새 배열에 복사한다.
	}

}
