package day6;

public class LastTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child("GPT", 30);

		System.out.println(child.name);
		System.out.println(child.age);
		/*
		1. 처음 선택되는 생성자는?
		처음 선택되는 생성자는 Child(String name, int age)
		
		2. super(name)은 정확히 무엇을 호출하는가?
		super(name)은 Parent(String name) 호출
		
		3. "Parent 생성자"와 "Child 생성자" 중 무엇이 먼저 출력되는가?
		Parent 생성자가 먼저 출력이 됨 
		Child 생성자 이전에 super(name)으로 Parent 생성자를 호출해서 Parent생성자가 완료되면 그다음 this.age문장이 실행되기 때문
		
		4. 최종 child.name 값?
		GPT
		
		5. 최종 child.age 값?
		30
		
		6. 객체는 총 몇 개 생성되는가?
		객체는 Child 객체 하나 (Parent를 상속하기 때문에 객체 안에 Parent 멤버도 같이 있음)
		
		 */
	}

}
