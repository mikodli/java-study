package day14;

import java.util.Scanner;

class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("나이: ");
        //int age = sc.nextInt();
        int age = Integer.parseInt(sc.nextLine());

        /*
         int age = sc.nextInt();
         sc.nextLine(); //남은 줄 바꿈 처리
         */
        
        System.out.print("이름: ");
        String name = sc.nextLine();

        System.out.println("age = " + age);
        System.out.println("name = [" + name + "]");

        sc.close();
        
        /*
        
		1. age에는 무엇이 저장되는가?
		25
		
		2. name에는 "Kim"이 정상적으로 저장될까?
		저장 안됨
		
		3. 아니라면 왜 그런가?
		nextInt()문제 nextInt()는 숫자 토큰 입력한 25만 읽고 뒤에 줄바꿈이 있는 부분은 뒤에 String name = sc.nextLine();에서 25를 nextInt()가 읽고 그뒤에 남겨진 빈값을 nextLine()이 읽음
		25뒤에 빈 문자열을 읽음 nextInt()는 25를 읽고 줄바꿈 하는것이 아니라 다음 int 값을 읽는것이고 nextLine은 줄을 읽는것
		
		4. 어떻게 수정하면 되는가?
		int age = Integer.parseInt(sc.nextLine());
		
		직접 수정 코드도 작성.
        
         */

	}

}
