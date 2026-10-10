package day4;

public class test2 {

	static void change(Data d) {
	    d.x = 1000;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data data = new Data();
		data.x = 10;

		change(data);

		System.out.println(data.x);
		/*
		 * 1000 
			처음 참조형 Data 를 생성하고 참조변수 data는 Data()를 참조하고 있고 그리고 data.x = 10; 으로 
			객체 Data()의 x값을 10으로 변경 그리고 change(data); 를 호출하고 
			Data()객체를 참조하고있는 참조변수 data 를 change에 넣었고 
			d는 data의 참조값을 복사 
			그래서 Data()객체를 참조하고있고 d.x = 1000; 변경해서 Data() 객체의 x를 10 -> 1000으로 변경했고 
			마지막에 data.x 를 프린트할때 data.x는 Data()객체의 x값을 참조함
		 */
	}

}
