package day8;

class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();

        System.out.println(p.value);
        p.print();
        p.parentMethod();

        // p.childMethod();

        Child c = (Child) p;
        c.childMethod();

        System.out.println(c.value);
        c.print();
        
        /*
		1. p.value 출력값은?
		10 
		인스턴스 변수는 참조변수의 타입을 기준으로 접근하기 때문

		2. p.print() 출력값은?
		그리고 왜 Parent 타입인데 Child의 메서드가 실행되는가?
		Child print
		오버라이딩된 인스턴스 메서드이므로 실제 객체 타입을 따른다.
		메서드는 인스턴스를 따라가기 때문
		
		3. p.parentMethod()는 가능한가? 이유는?
		가능함
		parentMethod()는 참조변수의 참조 타입에 있는 메서드이기때문에
		
		4. p.childMethod()는 왜 컴파일되지 않는가?
		객체는 Child 라는 인스턴스를 생성했지만 참조하는 타입은 Parent로 선언했기 때문에 Parent에 있는 멤버에만 접근이 가능하다.
		
		5. Child c = (Child) p;가 가능한 이유는?
		실제 객체가 Child 이기 때문에 가능
		인스턴스를 p의 참조타입인 Parent의 자손으로 생성했기 때문에
		
		6. c.value 출력값은?
		20
		c의 참조타입이 Child 이고 p의 참조타입을 Child로 다운캐스팅 했기 때문에 Child에 있는 value를 바라봄
		
		7. c.print() 출력값은?
		Child print c의 참조 타입은 Child 이기때문에
		
		8. Parent p2 = new Parent(); 
		   Child c2 = (Child)p2;는 컴파일 시 / 실행 시 각각 어떻게 되는가?
		컴파일은 문제없는데 
		실행 시 Child c2 = (Child)p2; 에서 에러가 발생 ClassCastException 발생
		왜냐하면 참조 변수 p2는 Parent의 인스턴스를 참조하는데 Parent 는 Child의 부모로
		p2를 다운 캐스팅 하는데 인스턴스 자체가 부모라 멤버가 다를 수 있기 때문에
		
		p2가 실제로 참조하는 객체가 Parent 객체이며 Child 객체가 아니므로 Child 타입으로 다운캐스팅 할 수 없다.
		
         */
        
		
	}

}
