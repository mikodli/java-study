package day1;

public class part3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		long b = a;
		//위의 내용은 정수형과 실수형 그러나 실수형이 더 크기때문에 선언한 b에 int 인a 값이 자동으로 형 변환이 된다.	
		
		long c = 10L;
		int d = (int) c;
		//위의 내용은 long 인 c가 실수형임으로 정수형인 d에 선언할땐 직접 형변환이 필요함
		
		int x = 300;
		byte y = (byte) x;
		
		System.out.println(y);
		//byte 는 2*7승 127까지 나타낼 수 있어 그러므로 오버플로우가 되고 300을 2진수로 변경하면 100101100 8bit 까지 오버플로우로 0010 1100 10진수로 다시 변경하면 44 
		
	}
	
}
