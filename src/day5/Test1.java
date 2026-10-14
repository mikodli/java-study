package day5;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students student1 = new Students("챗지피티", 99 , 95 , 96);
		/*
		 * 
		 * */
		Students student2 = new Students("제미나이", 88 , 85 , 86);
		
		System.out.println("이름 : " + student1.name);
		System.out.println("총점 : " + student1.getTotal());
		System.out.println("평균 : " + student1.getAverage());
		System.out.println("이름 : " + student2.name);
		System.out.println("총점 : " + student2.getTotal());
		System.out.println("평균 : " + student2.getAverage());
		System.out.println("총학생 수 : " + Students.studentCount);
		
		
		/*
		 *Students student1 = new Students("챗지피티", 99 , 95 , 96); 만 호출되었을때 
		 * 맨처음 호출되는 생성자는 ? Students(String name , int korean , int english , int math)
		 * Students인스턴스를 생성과 동시에 생성자를 써서 초기화 하는데 초기화에 그냥 Students()가 아닌 Students("챗지피티", 99 , 95 , 96)
		 * 으로 초기화 했기 때문에 
		 * this(); 가 실행되면 Students() 생성자를 호출
		 * studentCount의 값은 ?
		 * studentCount++은 Students() 생성자가 호출될 때마다 실행하기 때문에 Students()생성자는 한번 실행 해서 1
		 * this.name = name 의 차이
		 * this.name 은 student1이 참조하고 있는 만들어진 인스턴스 Student의 인스턴스 변수 name 
		 * name 은 매개변수 name
		 * */
		
	}

}
