package day4;

class LastTest6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[3];

		students[0] = new Student();
		students[1] = students[0];
		students[2] = new Student();
	
		/*
		 * Student[] students = new Student[3];에서 students라는 배열 객체 하나 생성 배열객체에 요소들에 아직 객체가 생성이 안되어있어 null로 초기화 되어있음
		 * students[0] = new Student(); 로 students[0]에서 Student()라는 객체 를 하나 생성 students[0]은 Student() 객체를 참조
		 * students[1] = students[0]; Students[1]은 students[0]이 Student()객체를 참조하고있는 참조값을 복사 객체 생성 X
		 * students[2] = new Student(); 로 students[2]에서 Student()라는 객체 를 하나 생성 students[2]은 Student() 객체를 참조
		 * 따라서 배열객체 하나 Student()객체 2개를 생성함
		 * 
		 */
		
		/*
		 * students[0] == students[1] 를 따지면 students[0] 과 students[1]은 같은 Student()객체를 참조 그래서 true
		 * students[0] == students[2] 는 각각 다른 객체를 참조하고있어 false
		 */
		
	}
}
