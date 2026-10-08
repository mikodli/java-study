package day2;

public class part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;

		int b = a++;

		System.out.println(a);
		//a는 초기화로 10으로 넣었고 두번째 구문 int b = a++; 에서 a가 +1 증가 했으므로 11
		System.out.println(b);
		// int b = a++; 값을 넣고 +1을 증가시킨 것이므로 10
		
		int c = 10;

		int d = ++c;

		System.out.println(c);
		//int c = 10; 으로 초기화 c = 10인데 두번째 구문 d = ++c; 에서 c가 +1 증가해서 11
		System.out.println(d);
		// int d = ++c; 는 c의 값을 +1 한 후 d에 값을 넣은것이므로 11
		
		
		int x = 10;

		if (x > 5) {
		    int y = 20;
		}

		System.out.println(x);
		//System.out.println(y);
		// X System.out.println(y); 이구문에서 컴파일 에러가 남 왜나하면 int y의 선언문이 if문 안에만 있어 if조건식이 false일 경우 선언자체도 안한 변수이므로
		//int y 선언된 위치는 if문 안이므로 지역변수이므로 해당 블록을 벗어나면 Scope 밖이 되어 접근할 수 없다.
	}

}
