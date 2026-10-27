package day13;

class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb1 = new StringBuffer("JAVA");
        StringBuffer sb2 = new StringBuffer("JAVA");

        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));

        String s1 = sb1.toString();
        String s2 = sb2.toString();

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        
        /*
        
        1. 네 줄의 출력 결과
		false
		false
		false
		true

		2. sb1.equals(sb2)가 왜 그 결과인가?
		StringBuffer 의 equals는 Object 클래스의 equals메서드에서 오버라이딩 하지 않고 Object 클래스 equals 메서드를 호출한 것이라 객체 비교를 함
		
		3. s1.equals(s2)는 왜 다른 결과가 나오는가?
		s1은 String 타입의 참조변수이고 String 객체를 참조한다. equals를 오버라이딩 해 객체가 갖고있는 값을 비교하기때문
		
		4. StringBuffer 두 객체의 문자열 내용을 비교하려면
		어떻게 하면 되는가?
        StringBuffer 객체를 toString() 메서드를 사용해 내용을 String타입의 참조변수에 담아 equals 로 비교
        
         */
		
	}

}
