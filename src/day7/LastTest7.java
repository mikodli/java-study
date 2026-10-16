package day7;

import day7.pack1.Parent;
import day7.pack2.Child;

public class LastTest7 extends Parent{
	 void test() {

	        System.out.println(this.c);   // A
	        System.out.println(super.c);  // B

	        LastTest7 lastTest7 = new LastTest7();
	        System.out.println(lastTest7.c);  // C

	        Parent parent = new Parent();
	        //System.out.println(parent.c); // D
	        /*
	        1. A~D 각각 컴파일 가능/불가능을 판단
	        A , B , C 가능
	        D 불가능 
	        
	        2. C와 D의 결과가 왜 다른지 설명
	        C는 Parent를 상속받은 클래스를 객체로 생성해서 인스턴스변수로 접근이 가능
	       	D는 상속받은 대로 사용이 아닌 Parent 객체를 생성해서 접근이라 불가능
	        
	         */
	    }
}
