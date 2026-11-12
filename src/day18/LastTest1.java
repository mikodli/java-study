package day18;

import java.util.*;

class LastTest1 {

    static class Student implements Comparable<Student> {

        String name;
        int score;

        Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        @Override
        public int compareTo(Student other) {

            // TODO: 비교 기준 직접 구현
        	//다음 학생들을 점수 내림차순, 점수가 같으면 이름 오름차순으로 정렬해라.
        	
        	if(this.score == other.score)
        		return this.name.compareTo(other.name);
        	        	        	
            return Integer.compare(other.score, this.score);
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

	1. compareTo()를 완성해라.
	
	2. 출력 결과를 작성해라.
	[Kim(90), Park(90), Choi(80), Lee(70)]
	
	3. Collections.sort(students)가 Student.compareTo()를 호출할 수 있는 이유는?
	참조변수 students 의 List에 선언된 타입이 Student이므로 Student에 오버라이딩한 compareTo()메서드를 호출해 Collections.sort하기때문
	
	4. compareTo(a, b)가 음수·0·양수를 반환하면 정렬 알고리즘은 각각 어떻게 해석하는가?
	두 객체 a, b가 음수를 반환하면 a가 b앞에 오고 0이면 설정된 비교값에 관계상 a와 b가 동등하고 양수를 반환하면 a가 b 뒤에 온다.
	
	5. compareTo()가 실제 리스트의 요소 위치를 변경하는가, Collections.sort()가 변경하는가?
	compareTo() 두객체 비교 결과를 반환하는 메서드
	실제 변경은 Collections.sort()메서드가 진행함
    
     */
    
}
