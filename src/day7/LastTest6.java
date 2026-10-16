package day7;

class LastTest6 {
	/*
		day7.pack1
	 ├─ Parent
	 └─ TestA
	
	day7.pack2
	 ├─ Child extends Parent
	 └─ TestB
	 
	 public class Parent {

	    private int a = 10;
	    int b = 20;
	    protected int c = 30;
	    public int d = 40;
	}

	TestA - 같은 패키지, 상속 관계 없음
	a    X        private 같은 클래스 내에서 접근
	b    O        default 같은 패키지 내에서 접근
	c    O        portected 같은 패키지 내 , 자손 클래스에서 까지 접근 가능
	d    O        public 접근제한 없음
	TestB - 다른 패키지, 상속 관계 없음
	a    X        private 같은 클래스 내에서 접근
	b    X        default 같은 패키지 내에서 접근
	c    X        portected 같은 패키지 내 , 자손 클래스에서 까지 접근 가능
	d    O        public 접근제한 없음
	
	
	Child - 다른 패키지 + Parent 상속
	a    X        private 같은 클래스 내에서 접근
	b    X        default 같은 패키지 내에서 접근
	c    O        portected 같은 패키지 내 , 자손 클래스에서 까지 접근 가능
	d    O        public 접근제한 없음
	

	 */
}
