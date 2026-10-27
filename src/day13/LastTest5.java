package day13;

class LastTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;

		Integer b = a;                    // 오토박싱 int 타입인 a를 Integer로 변환

		int c = b;                        // 언박싱 Integer 타입인 b를 int 타입으로 변환

		Integer d = Integer.valueOf(20);  // 명시적 변환

		int e = d.intValue();             //  Integer 타입 d를 int형으로 언박싱 명시적 변환

		String s = String.valueOf(a);     // 형변환 int형 10을 String 형으로 명시적 변환
		
		

	}

}
