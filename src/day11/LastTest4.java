package day11;

class LastTest4 {
	
	static void work() {

	    Connection con1 = new Connection("DB1");
	    Connection con2 = new Connection("DB2");

	    try {

	        con1.execute();
	        con2.execute();

	    } finally {

	        con1.close();
	        con2.close();
	    }
	}
	
	static void work2() {

	    try (Connection con1 = new Connection("DB1"); Connection con2 = new Connection("DB2")){

	        con1.execute();
	        con2.execute();
	    }
	}
	
	/*
	1. 현재 코드에서 자원 종료 순서는?
	con1 -> con2
	
	2. 이 코드를 try-with-resources 방식으로 직접 수정해봐.
	위 메서드 work2()

	3. 수정된 코드에서는 종료 순서가 어떻게 되는가?
	con2종료 -> con1종료

	4. 왜 그 순서로 종료되는가?
	try-with-resources에서 생성된 객체 순서의 역순으로 close 하도록 설계되어 있기 때문

	5. try-with-resources를 사용하면 기존 finally 방식보다 어떤 점이 좋아지는지 설명해봐.
	try 문이 종료가 되면 자동으로 close()를 호출하기 때문에 finally에 직접 매번 close()호출문을 추가할 필요가 없다.
	자원을 자동으로 닫아 코드가 간결해지고 자원 해제를 빼먹을 가능성이 줄며, 본문과 close에서 동시에 예외가 발생했을 때 suppressed exception을 통해 예외 정보를 보존할 수 있다.
	
	 */
	
}
