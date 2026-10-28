package day14;

import java.util.StringTokenizer;

class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String data = "JAVA,SPRING;POSTGRESQL";

	        StringTokenizer st =
	                new StringTokenizer(data, ",;");

	        while (st.hasMoreTokens()) {
	            System.out.println(st.nextToken());
	        }

	}
	
	/*
	
	1. 출력 결과는?
	JAVA
	SPRING
	POSTGRESQL
	
	2. ",;"는 ",;"라는 두 글자의 구분자 하나를 의미하는가?
	구분자가 , 와 ; 두개를 의미
	
	3. 실제로 어떤 문자들이 delimiter 역할을 하는가?
	, ;
	
	4. hasMoreTokens()의 역할은?
	StringTokenizer st의 다음토큰이 있는지 확인	
	
	 */

}
