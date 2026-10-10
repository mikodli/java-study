package day4;

class LastTest4 {
	
	static void change(Data d) {
	    d.value = 50;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data a = new Data();
		a.value = 10;

		Data b = a;

		change(b);

		System.out.println(a.value);
		System.out.println(b.value);
		/*
		 * 참조변수 a 는 Data() 객체를 생성해 참조 이걸 D라 표현
		 * a.value = 10; 으로 D객체에 있는 value 값을 = 10으로 변경 
		 * Data b = a;로 참조변수 b는 참조변수 a의 참조값을 복사 b 는 객체 D를 참조
		 * change(b); b의 참조값이 매개변수 d에 복사 d는 객체 D를 참조 d.value = 50; 으로 객체 D의 value값은 10 -> 50으로 변경
		 * a.value , b.value는 a, b둘다 D객체를 참조 따라서 둘다 50
		 */
	}

}
