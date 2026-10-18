package day8;

class LastTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p = new Child();

		System.out.println(p.value); // A
		p.show();                    // B
		
		/*
		A는 p.value 인스턴스 변수이므로 참조변수의 타입인 Parent를 따라가서 10 
		
		B는 오버라이딩된 메서드이므로 실제 객체인 Child 의 show()를 따라가고 
		System.out.println(value);의 value 는 실제 객체 Child의 value를 가리키는 것 그래서 20
		System.out.println(super.value);의 value는 super 부모의 value 를 나타내므로 10
				
		 */

	}

}
