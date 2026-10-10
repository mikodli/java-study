package day4;

class Calculator {
	static int number = 10;

    static void print() {
        System.out.println(number);
        //컴파일 에러가 남 인스턴스 변수인 number는 class 메서드인 print()안에서 사용이 불가능 
        //사용이 가능하려면 인스턴스 변수 number를 class 변수로 변경해줘야함
        //반대로 class메서드인 print()를 인스턴스 메서드로 변경해주거나.
    }
}
