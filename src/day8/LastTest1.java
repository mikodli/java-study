package day8;

class LastTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		/*
			1. p의 참조변수 타입은?
			p의 참조변수 타입은 Parent
			
			2. 실제 생성된 객체 타입은?
			실제 생성된 객체 타입은 Child
			
			3. 객체는 총 몇 개 생성되는가?
			객체는 new Child()로 Child 객체 총 1개
			
			4. p.childMethod()가 컴파일되지 않는 이유는?
			p.childMethod()가 컴파일 되지 않는 이유는 
			참조변수의 타입이 Parent로 실제 생성된 객체 Child에는 있지만 접근가능한 멤버는 Parent 타입에 있는 멤버만 가능하기 때문
			
		 */

	}

}
