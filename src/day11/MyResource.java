package day11;

class MyResource implements AutoCloseable{

	private String name;
	public MyResource(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		System.out.println(name + " 생성");
	}
	@Override
	public void close(){
		// TODO Auto-generated method stub
		System.out.println(name + " 종료");
	}

		
}
