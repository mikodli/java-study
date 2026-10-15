package day6;

public class Student extends Person{
	int score;
	Student(String name, int score){
		super(name);
		this.score = score;
	}
	@Override
	void introduce() {
		// TODO Auto-generated method stub
		super.introduce();
		System.out.println("점수 : " + score);
	}
	void study() {
		System.out.println("공부합니다.");
	}
	
}
