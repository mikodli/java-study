package day14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("\\d+");

        Matcher m1 = p.matcher("12345");
        Matcher m2 = p.matcher("ABC123DEF");

        System.out.println(m1.matches());
        System.out.println(m2.matches());
        System.out.println(m2.find());

	}
	
	/*
	
	1. 세 줄 결과는?
	true
	false
	true
	
	2. "\\d+"가 의미하는 것은?
	숫자가 연속으로 있는지
	
	\d -> 숫자 한 문자
	+  -> 앞의 패턴이 1회 이상
	\\d+ -> 숫자가 1개 이상 연속
	
	3. Java 문자열에서 왜 "\d+"가 아니라 "\\d+"라고 작성하는가?
	큰따옴표내에서 escape문자 \ 표현하려면 escape 문자를 두번 사용해야되기 때문
	
	4. matches()와 find()의 차이는?
	matches()는 전체 문자열이 일치하는지 확인 find()는 문자열 일부에서 패턴과 일치하는부분을 찾는것.
	
	 */

}
