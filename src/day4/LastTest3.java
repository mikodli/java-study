package day4;

class LastTest3 {
	static void change(int a) {
	    a += 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
	
		change(x);
		
		System.out.println(x);
		/*
		 * x는 기본형 변수 5 change(x); 는 매개변수 a에 x의 값인 5를 복사한것 change에서 a += 10; 으로 a = 15
		 * 하지만 println(x); x를 했기때문에 x는 그대로 5
		 */
	}
}
