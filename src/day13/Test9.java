package day13;

class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a = 100;
        Integer b = 100;

        Integer c = 1000;
        Integer d = 1000;

        System.out.println(a == b);
        System.out.println(a.equals(b));

        System.out.println(c == d);
        System.out.println(c.equals(d));
        
        /*
         1. 예상 결과와 이유?
         true
         true
         false
         true
         
         ==은 참조값을 비교하는것으로 Integer 타입의 참조변수 이기 때문에 참조값이 다르지만 Java에서 Integer -128 ~ 127 까지는 캐싱하여 재사용함으로 a , b 는 그 범위인 100이라 참조값이 동일
         equals는 객체의 값을 비교하는것이라 a와 b는 100으로 true
         c와 d는 1000이지만 캐싱 범위가 아니기 때문에 c와 d의 참조값은 달라서 false
         객체의 값은 1000으로 동일하여 equals 는 true
         
         */

	}

}
