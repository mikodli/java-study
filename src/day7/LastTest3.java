package day7;

public class LastTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("A");
		Student s2 = new Student("B");
		Student s3 = new Student("C");

		System.out.println(Student.count);
		System.out.println(s1.count);
		
		/*
		1. 출력값 2개는?
		3
		3
		count의 값을 변경하는 count++이 Student 클래스의 Student(String name) 메서드에 있는데 new Student로 3번 호출해서
		
		2. count 객체가 3개 생성됐으니 count도 3개 존재하는가?
		count는 클래스 변수로 1개가 생성되고 하나의 변수를 생성된 3개의 인스턴스가 사용함
		
		3.Student.count로 접근하는 것을 권장하는 이유는?
		count 는 static인 클래스변수임으로 객체로 호출하는것이 아닌 클래스명으로 호출하는 것을 권장함
		
		 */
	}

}
