package day14;

import java.util.Scanner;
import java.util.StringTokenizer;

class LastTest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Scanner sc =
	                new Scanner(System.in);

	        System.out.print("번호: ");
	        int number = sc.nextInt();

	        System.out.print("설명: ");
	        String description =
	                sc.nextLine();

	        System.out.println(
	            "number = " + number
	        );

	        System.out.println(
	            "description = ["
	            + description + "]"
	        );

	        /*
	        
	        100[Enter]
			Spring Backend[Enter]

			1. number에는 무엇이 저장되는가?
			100
			
			2. description에는 무엇이 저장되는가?
			빈문자열""
			
			3. 왜 "Spring Backend"가 바로 저장되지 않는가?
			왜냐하면 sc.nextInt에서 숫자 100을 가져가고 줄바꿈을 하지 않은채 종료된 후 sc.nextLine()을 실행해 100뒤에 빈 문자열을 가져가기 때문
			* nextInt()는 정수 토큰 100을 읽고, 이어지는 줄의 끝을 nextLine()이 처리하면서 현재 줄에 반환할 문자열 내용이 없어 ""을 반환한다.
			
			4. description에 "Spring Backend"가 정상적으로 들어가도록 코드를 수정해라.
			int number = sc.nextInt();
			sc.nextLine();
	        
	         */
	        
	}

}

class Test9_2 {

    public static void main(String[] args) {

        StringTokenizer st =
            new StringTokenizer(
                "JAVA,SPRING|POSTGRESQL",
                ",|"
            );

        while (st.hasMoreTokens()) {
            System.out.println(
                st.nextToken()
            );
        }
    }
    
    /*
    
    5. 출력 결과는?
    JAVA
    SPRING
    POSTGRESQL
    
	6. ",|"의 의미는?
	,와 | 이 두개를 구분자로 사용
	
	7. hasMoreTokens()의 역할은?
    다음의 토큰이 있는지 확인
    
     */
    
}