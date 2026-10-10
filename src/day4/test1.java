package day4;

public class test1 {

	static void change(int x) {
		x = 100;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 10;
		
		change(number);
		
		System.out.println(number);
		/*
		 * 기본형 변수 number 는 10이라는 값을 매개변수 x에 넘겨줬지만 x = 100;으로 해도 기본형 변수 number에는 영향을 주지 않는다.
		 * 따라서 마지막 프린트는 10으로 나온다. Call by Value
		 */
		
	}

}
