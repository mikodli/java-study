package day15;

import java.text.DecimalFormat;

class LastTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat a =
                new DecimalFormat("#,##0");

        DecimalFormat b =
                new DecimalFormat("0000");

        DecimalFormat c =
                new DecimalFormat("0.00");

        System.out.println(a.format(9876543));
        System.out.println(b.format(25));
        System.out.println(c.format(7.5));
        System.out.println(c.format(7));
        
        /*
        
		1. 출력 4줄은?
		9,876,543
		0025
		7.50
		7.00
		
		2. 0과 # 패턴의 차이는?
		0은 그 자리수가 안맞으면 0을 채움
		#은 자리수가 모자라도 따로 채우지 않음
		
		3. format()의 반환 타입은?
		String
		
		4. 숫자 25를 "0025"로 포맷하면 원래 숫자 변수의 값도 변경되는가?
		불변
		
		5. 데이터베이스에 저장할 금액과 사용자 화면에 표시할 금액을 구분해야 하는 이유는?
		금액은 쉼표 단위로 표현되기 때문에 화면에 표시할 금액은 String 형태로 보여주고
		데이터베이스에는 숫자타입으로 저장하기 때문
        
         */

	}

}
