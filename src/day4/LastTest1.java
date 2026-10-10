package day4;

public class LastTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c1 = new Counter();
		Counter c2 = new Counter();

		c1.number++;
		c1.total++;

		c2.number++;
		c2.total++;

		System.out.println(c1.number);
		//c1이 참조하고있는 number는 인스턴스 변수 그래서 c1.number++ 한번만 적용되어 = 1
		System.out.println(c2.number);
		//c2이 참조하고있는 number는 인스턴스 변수 그래서 c2.number++ 한번만 적용되어 = 1
		System.out.println(Counter.total);
		//static int total = 0; static class변수로 모든 클래스에서 공유 c1.total++; , c2.total++; 2번으로 = 2
		
	}

}
