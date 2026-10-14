package day5;

public class Students {
	static int studentCount;
	
	String name;
	int korean;
	int english;
	int math;
	
	Students(){
		studentCount++;
	}
	
	Students(String name, int korean, int english, int math){
		this();
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	int getTotal() {
		return korean + english + math;
	}
	double getAverage() {
		return (double)getTotal() / 3;
	}
	
}
