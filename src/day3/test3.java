package day3;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = {0, 1, 2, 3, 4};
		
		for(int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		/* index 는 0부터 시작해 사이즈의 -1까지 나타냄
		 * score.length 는 score의 사이즈 index + 1을 나타냄
		 * score.length 에서 length는 메소드가 아니기 때문에 ()가 안붙음
		 * i < score.length 로 한 이유는 지금 score는 총 5개의 값을 갖고있으므로 length = 5 index최대는 4 그래서 i가 0부터 5보다 작을때까지 진행 
		 */
		
		int Array[][] = {{30 , 40 , 50} , {60 , 70 , 80}, {90 , 100 , 95}, {80 , 70 , 60}};
		
		for(int i = 0; i < Array.length; i++) {
			for(int j = 0; j < Array[i].length; j++) {
				System.out.print(Array[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
