package day2;

public class part4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*60 미만 → 출력하지 않음

		90 이상 → A
		80~89 → B
		70~79 → C
		60~69 → D
		for + if + continue 사용
		*/
		int[] scores = {90, 45, 76, 30, 100};
		
		for(int s : scores) {
			if(s >= 90) {
				System.out.println("A");
			}else if(s >= 80) {
				System.out.println("B");
			}else if(s >= 70) {
				System.out.println("C");
			}else if(s >= 60) {
				System.out.println("D");
			}else {
				continue;
			}
		}
		
	}

}
