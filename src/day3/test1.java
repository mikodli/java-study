package day3;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {10, 20, 30};
		int[] b = a;

		b[0] = 100;

		System.out.println(a[0]);
		//배열읜 참조형 변수이므로 배열 a는 {10, 20, 30}을 참조하고있고 b = a;이니까 b도 동일한 {10, 20, 30} 배열을 참조하고 있음 b[0]은 {10, 20, 30} 배열의 0번째 인덱스 10을 가리키고 거기에 100을 넣었으니 a[0] 역시 100
		System.out.println(b[0]);
		//위와 동일한 이유로 참조변수 b의 0번째 인덱스는 {100, 20, 30} 에서 100을 가리킴 그래서 100
		
	}

}
