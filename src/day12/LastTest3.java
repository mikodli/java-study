package day12;

class LastTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Java,Spring,PostgreSQL";

		System.out.println(str.substring(5, 11));
		//Spring
		//substring(begin, end) begin <= ¹üÀ§ < end
		
		System.out.println(str.indexOf("Spring"));
		//5
		
		System.out.println(str.contains("Java"));
		//true

		String[] arr = str.split(",");
		
		System.out.println(arr.length);
		//3		
		
		System.out.println(arr[2]);
		//PostgreSQL
		
		
		
	}

}
