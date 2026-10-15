package day6;

public class LastTest8 {
	/*
	class Person {

	    String name;
	
	    Person() {
	        System.out.println("1");
	    }
	
	    Person(String name) {
	        this();
	        this.name = name;
	        System.out.println("2");
	    }
	}
	
	class Student extends Person {

	    int score;
	
	    Student(String name) {
	        super(name);
	        System.out.println("3");
	    }
	
	    Student(String name, int score) {
	        this(name);
	        this.score = score;
	        System.out.println("4");
	    }
	}
	
	Student student = new Student("GPT", 100);

	System.out.println(student.name);
	System.out.println(student.score);
	
	1. 처음 선택되는 생성자는?
		처음 선택되는 생성자는 Student("GPT", 100);으로
		매개변수 두개인 Student(String name, int score)가 호출됨
		
	2. 생성자 호출 순서를 전부 써봐.
		Student(String name, int score) >
		this(name)이라 Student(String name) >
		super(name)이라 Person(String name) > 
		this()라 Person() 
		순으로 호출됨
		
	3. 숫자 "1", "2", "3", "4"는 어떤 순서로 출력되는가?
	1 > 2 > 3 > 4
	
	4. 마지막 student.name, student.score 출력값은?
	GPT
	100
	
	5. Person 생성자가 2개, Student 생성자가 2개 실행된다. 그렇다면 객체도 4개 생성되는가? 실제 객체 수와 이유를 설명해봐.
	생성자 호출은 4번 발생하지만 객체 생성 표현식 new Student(...)는 한 번이므로 Student 객체는 하나만 생성된다.
	this()와 super()는 새로운 객체를 생성하는 것이 아니라 현재 객체를 초기화하기 위한 생성자 호출
	 */
}
