package day3;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//총점 / 평균 / 최고점 / 최저점 / 60점 이상 인원수
		int[] scores = {75, 90, 43, 100, 68, 82};

		int max = scores[0];
		int min = scores[0];
		int avr = 0;
		int all = 0;
		int sixpeople = 0;
		
		for(int i = 0; i < scores.length; i++) {
			all += scores[i];
			if(scores[i] > max) {
				max = scores[i];
			}
			if(scores[i] < min) {
				min = scores[i];
			}
			if(scores[i] >= 60) {
				sixpeople++;
			}
		}
		avr = all / scores.length;
		
		System.out.println("총점 : " + all);
		System.out.println("평균 : " + avr);
		System.out.println("최고점: " + max);
		System.out.println("최저점: " + min);
		System.out.println("60점 이상 인원수 : " + sixpeople);
		
	}

}
