package day9;

class LastTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c = new Child();
		c.run();
		/*
		1. 출력 순서를 전부 써봐.
		Parent
		Child
		Run
		
		2. 객체는 몇 개 생성되는가?
		객체는 Child() 객체 생성

		3. Parent가 추상 클래스인데도 Parent() 생성자가 실행되는 이유는?
		Parent가 추상 클래스이지만 Child에서 extends 상속을 했고 Child() 생성자에 원래 기본으로 super() , 나 this()가 있어야하는데 생략하면
		컴파일러에서 자동으로 super();를 호출하기 떄문에
		 
		 */
		
	}

}
