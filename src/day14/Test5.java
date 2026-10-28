package day14;

class Test5 {
	/*
	영문 소문자로 시작
	영문 소문자 + 숫자만 허용
	전체 길이 5~10자
	 */
	
	 static boolean validId(String id) {

	        return id.matches("[a-z][a-z0-9]{4,9}");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(validId("abc12"));
	     System.out.println(validId("a1234"));
	     System.out.println(validId("1abcd"));
	     System.out.println(validId("ab"));
	     System.out.println(validId("abc_123"));
	     System.out.println(validId("abcdefghijk"));

	}

}
