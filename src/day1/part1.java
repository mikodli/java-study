package day1;

public class part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = a;
		
		b = 20;
		
		System.out.println(a);
		//a라는 변수에 10으로 초기화 후  a의 변수의 변환이 없었으므로 10
		System.out.println(b);
		//b라는 변수를 선언 시 a를 넣었고 b는 기본형이므로 주소가 아닌 값을 입력 처음 b라는 변수에 a 의 리터럴값 즉 10이 들어갔지만 후에 b = 20;이라는 b에 20이라는 리터럴 값을 넣어줘서 20이 출력
		
	}

}
