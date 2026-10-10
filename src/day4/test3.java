package day4;

public class test3 {

	static void change(Data d) {
	    d = new Data();
	    d.x = 1000;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data data = new Data();
		data.x = 10;

		change(data);

		System.out.println(data.x);
		/*
		 * change(data); 를 해서 매개변수 d에는 참조변수 data의 참조값을 넣어줬고 
		 * 처음에 생성된 Data()객체를 참조하고있었는데 d = new Data();를 해서 매개변수 d는 처음에 생성된 Data()객체를 참조하는것이 아닌 새로 생긴 Data() 객체를 참조
		 * 그 Data() 객체의 x변수에 1000을 넣었지만 data는 처음 생성한 Data() 객체를 참조하고있으니 data.x는 10
		 */
	}
}
