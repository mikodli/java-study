package day2;

public class part2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 20;

		if (age >= 18 && age <= 30) {
		    System.out.println("통과");
		}
		// if문 조건식 왼쪽 (age) 20  >= 18 = true 오른쪽 (age) 20 <= 30 true && and 연산이므로 양쪽다 true 이면 true 반환 그래서 통과 출력 
		
		int a = 10;
		int b = 20;

		if (a > 20 && ++b > 20) {
		    System.out.println("통과");
		}

		System.out.println(b);
		// if문 조건식 왼쪽 (a)10 > 20 false &&연산이라 오른쪽 구문 ++b > 20은 실행 안함 따라서 20출력 
		
	}
}
