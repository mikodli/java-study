package day15;

import java.text.ChoiceFormat;

class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChoiceFormat cf =
                new ChoiceFormat(
                    "60#D|70#C|80#B|90#A"
                );

        System.out.println(cf.format(59));
        System.out.println(cf.format(60));
        System.out.println(cf.format(70));
        System.out.println(cf.format(80));
        System.out.println(cf.format(89));
        System.out.println(cf.format(90));
        
        /*
       	
		1. 출력 6줄은?
		D
		D
		C
		B
		B
		A		
		
		2. #는 경계값을 포함하는가?
		경계값 포함
		
		3. <는 경계값을 포함하는가?
		경계값 미포함
		
		4. 80#B를 80<B로 변경하면 점수 80의 결과는?
		그 이전 경계값의 반환값인 C
		
		5. 이 패턴에서 점수 59가 D로 처리되는 이유는?
		D보다 낮은 패턴이 없기 때문에 0~69까지가 D로 처리됨
       	
         */
		
	}

}
