package day12;

class Test1 {
		public static void main(String[] args) {
			User u1 = new User(100, "Kim");
			User u2 = new User(100, "Lee");
			User u3 = new User(200, "Kim");
			
			System.out.println(u1 == u2);
			System.out.println(u1.equals(u2));
			System.out.println(u1.equals(u3));

			System.out.println(u1.hashCode());
			System.out.println(u2.hashCode());

			System.out.println(u1);
			/*
			false
			true
			false
			100
			100
			ID는 100 이름은 Kim			
			 */
		}
}
