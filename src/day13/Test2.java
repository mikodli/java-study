package day13;

class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer(50);
        StringBuffer sb3 = new StringBuffer("JAVA");

        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        System.out.println(sb3.length());
        System.out.println(sb3.capacity());
        
        /*
        1. 6개 출력 결과 예상
		0
		16
		0
		50
		4
		20

		2. new StringBuffer(50)의 50은
		   length인가 capacity인가?
		   capacity
		
		3. length와 capacity의 차이는?
		capacity 는 용량 그 StringBuffer객체의 용량을 말하는 것이고 length는 그 객체가 갖고있는 내용의 길이를 나타냄 
		
		4. sb3의 length가 왜 4인지?
        sb3 는 JAVA라는 내용을 갖고있고 총 4글자이기 때문에
        
        
         */

	}

}
