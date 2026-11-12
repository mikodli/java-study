package day18;

import java.util.*;

class Test5 {

    static class Student implements Comparable<Student> {

        String id;
        String name;
        int score;

        Student(String id, String name, int score) {
            this.id = id;
            this.name = name;
            this.score = score;
        }

        @Override
        public int compareTo(Student other) {
        	if(this.id.equals(other.id)) return 0;       	
        	
        	if(this.score == other.score) {
        		return this.id.compareTo(other.id);
        	}
        	
            return Integer.compare(this.score, other.score);
        }

        @Override
        public String toString() {
            return id + ":" + name + "(" + score + ")";
        }
    }

    public static void main(String[] args) {

        TreeSet<Student> students = new TreeSet<>();

        students.add(new Student("S01", "Kim", 90));
        students.add(new Student("S02", "Lee", 90));
        students.add(new Student("S03", "Park", 80));
        students.add(new Student("S01", "Kim", 90));

        System.out.println(students.size());
        System.out.println(students);
    }
    
    /*
    
	    요구사항:
	- 점수 오름차순으로 정렬한다.
	- 점수가 같으면 학생 ID 오름차순으로 정렬한다.
	- 학생 ID가 같으면 동일한 학생으로 취급한다.
	- 학생 이름이 달라도 ID가 같으면 중복 저장하지 않는다.
	이 문제에서는 동일한 학생 ID의 점수는 변경되지 않는다고 가정
	
	1. 원본 코드에서 출력되는 students.size()는?
	2
	
	2. 서로 다른 학생인데도 데이터가 누락되는 이유는?
	Student 클래스에서 오버라이딩한 compareTo가 score 만 비교하기 때문에 점수가 90점인 데이터는 3개라 그중 1개만 저장되기 때문
	
	3. 요구사항을 만족하도록 compareTo()를 수정해라.
	
	
	4. 수정 후 students.size()는?
	3
	
	5. HashSet과 TreeSet은 각각 무엇을 기준으로 중복을 판단하는가?
	HashSet 은 equals(), hashCode()
	TreeSet 은 compareTo(), Comparator
	
	6. TreeSet에서 객체 비교 결과가 0이라는 것은 어떤 의미인가?
	동일한 객체는 아니지만 중복이라는 의미
    
     */

}
