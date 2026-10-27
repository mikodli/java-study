package day13;

class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringBuffer sb = new StringBuffer("Java");

        StringBuffer result = sb.append(" Spring");

        System.out.println(sb);
        System.out.println(result);

        System.out.println(sb == result);
        
        /*
        1. 출력 결과는?
		Java Spring
		Java Spring
		true

		2. sb == result 결과는?
		true

		3. 왜 그런 결과가 나오는가?
		StringBuffer 는 mutable이라 sb.append(" Spring"); 에서 StringBuffer sb가 새로운 Java Spring 을 참조하는것이 아닌 
		기존 참조값 Java에서 " Spring"내용을 추가한것이고 StringBuffer result 는 sb와 같은 참조값을 참조하고있기 때문

		4. String의 concat()과 StringBuffer의 append()는
   		객체 변경 관점에서 무엇이 다른가?
   		Stinrg 은 immutable 이라 객체 생성시 객체의 값이 변경되지 않고 concat()메서드로 내용을 추가 시 새로운 객체를 생성해 내용을 추가하는것이고
   		StringBuffer의 append() 기존의 참조값에 내용을 추가하는것이라 객체를 변경하지 않는다.
   		
         */
        
	}

}
