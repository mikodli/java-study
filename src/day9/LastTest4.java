package day9;

class LastTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1. MAX에는 실제로 어떤 제어자들이 생략되어 있는가?
		public static final
		
		2. start()에는 실제로 어떤 제어자들이 생략되어 있는가?
		public abstract

		3. 아래 코드는 가능한가?
		Machine m = new Machine();
		인터페이스 자체는 인스턴스 생성 불가능

		4. 아래는 가능한가?
		Machine m = new Car();

		단:
		class Car implements Machine {
		
		    @Override
		    public void start() {
		        System.out.println("시동");
		    }
		}
		가능함 
		다형성으로 참조변수의 타입은 인터페이스 Machine 이지만 생성된 실제 객체는 인터페이스를 구현하고 있는 클래스 Car 이므로 가능
		
		
		
		 */
	}

}
