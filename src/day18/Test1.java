package day18;

import java.util.*;

class Test1 {

    static class Student implements Comparable<Student> {

        String name;
        int score;

        Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        @Override
        public int compareTo(Student other) {
        	
            // TODO:
            // 1. 점수 내림차순
            // 2. 점수가 같으면 이름 오름차순
        	if(this.score==other.score) {
        		System.out.println(this.name + "    :    " + other.name);
        		return this.name.compareTo(other.name);
        	}
        	return Integer.compare(this.score, other.score);
        }

        @Override
        public String toString() {
            return name + "(" + score + ")";
        }
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Kim", 90));
        students.add(new Student("Lee", 70));
        students.add(new Student("Park", 90));
        students.add(new Student("Choi", 80));

        Collections.sort(students);

        System.out.println(students);
    }
    
    
    /*
    
	1. compareTo()를 직접 완성해라.
	
	
	2. 정렬 후 출력 결과를 작성해라.
	[Lee(70), Choi(80), Kim(90), Park(90)]
	
	3. this.score와 other.score의 의미는?
	this.score 은 이 클래스 내의 멤버 변수 score 를 뜻
	other.score는 매개변수로 들어온 Student 타입의 참조변수 other의 score를 뜻 
	
	4. compareTo()가 0을 반환한다는 것은 반드시 동일한 객체라는 뜻인가?
	동일한 객체라는 뜻은 아님
	
	5. Collections.sort()와 compareTo()는 각각 어떤 역할을 수행하는가?
    compareTo()는 두 객체의 비교 결과를 반환하는 메서드
    Collections.sort()는 정렬 조건대로 정렬
    
     */

}
