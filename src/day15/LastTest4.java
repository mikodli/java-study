package day15;

import java.text.ChoiceFormat;

class LastTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ChoiceFormat cf =
                new ChoiceFormat(
                    "50#FAIL|70#C|80<B|90#A"
                );

        System.out.println(cf.format(49));
        System.out.println(cf.format(50));
        System.out.println(cf.format(70));
        System.out.println(cf.format(80));
        System.out.println(cf.format(81));
        System.out.println(cf.format(90));
        
        /*
        
		1. 출력 6줄은?
		FAIL
		FAIL
		C
		C
		B
		A
		
		2. #와 <의 차이는?
		#은 경계값 포함
		<는 경계값 미포함
		
		3. 점수 80은 왜 해당 등급으로 처리되는가?
		80<B로 경계값 80을 포함하지 않아 이전 경계값에 해당되기 때문
		
		4. 점수 81은 어떤 등급인가?
		B
		
		5. 80점부터 B등급을 적용하려면 패턴을 어떻게 수정해야 하는가?
		80#B
        
         */

	}

}
