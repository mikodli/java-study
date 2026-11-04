package day15;

import java.text.DecimalFormat;

class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	       DecimalFormat df1 =
	                new DecimalFormat("#,##0");

	        DecimalFormat df2 =
	                new DecimalFormat("00000");

	        DecimalFormat df3 =
	                new DecimalFormat("0.00");

	        System.out.println(df1.format(1234567));
	        System.out.println(df2.format(123));
	        System.out.println(df3.format(12.345));
	        System.out.println(df3.format(12));
	        
	        /*
	        
		1. 출력 4줄은?
		1,234,567
		00123
		12.35
		12.00
		
		2. 패턴에서 0과 #의 차이는?
		0은 자리수가 부족하면 0으로 채움 
		#은 그 패턴이 맞을 시 빈자리를 채우지 않음
		
		3. #,##0에서 쉼표의 역할은?
		숫자 사이에 쉼표로 표시하는 역할
		
		4. DecimalFormat.format()의 반환 타입은?
		String
		
		5. DecimalFormat은 숫자 자체를 변경하는가, 숫자의 표현 형식을 변경하는가?
		숫자의 표현 형식을 변경
	        
	         */
		
	}

}
