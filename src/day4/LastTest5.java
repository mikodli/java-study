package day4;

class LastTest5 {
	static void change(Data d) {

	    d.value = 50;

	    d = new Data();

	    d.value = 100;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data a = new Data();
		a.value = 10;

		change(a);

		System.out.println(a.value);
		/*
		 * 참조변수 a는 Data()라는 객체를 참조 객체 생성된 객체 Data()를 D라 표현
		 * a.value = 10; 으로 객체 D의 value값은 10
		 * change(a); 해서 매개변수 d에는 a의 참조값을 복사 d는 D를 참조 d.value = 50;으로 객체 D의 value값은 10 -> 50 으로 변경
		 * 그리고 d = new Data(); 로 d는 새로운 객체 Data()를 생성하고 새로운객체 Data()를 F라 표현 F의 value 값을 100으로 변경
		 * a.value 는 객체 D를 참조하고 D의 value 는 50 따라서 50이 출력 
		 */
	}

}
