package day14;

import java.util.Objects;

class Test2 {

	  static void printName(String name) {

	        String checked =
	                Objects.requireNonNull(name, "name은 null일 수 없습니다.");

	        System.out.println(checked);
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  printName("Kim");
	      printName(null);

	        System.out.println("END");
		
	}
	
	/*
	
	1. 어디까지 출력되는가?
	Kim
	name은 null일 수 없습니다.
	
	2. 발생하는 예외는?
	NullPointerException
	
	3. "name은 null일 수 없습니다."는 어디에서 확인할 수 있는가?
	Objects.requireNonNull 메서드에서
	
	4. "END"는 출력되는가? 이유는?
	출력되지 않음 printName(null); 에서 예외가 발생했기 때문
	
	5. requireNonNull()을 사용하는 목적은 무엇이라고 생각하는가?
	null이 들어왔을 때 발생할 NullPointerException 예외확인하기 위해서
	* null이어서는 안되는 값을 즉시 검증하고, null이면 명확한 지점에서 NullPointerException을 발생시키기 위함
	
	 */

}
