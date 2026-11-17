package day19;

class LastTest3 {

	/*
	
	Hashtable<String, String> table = new Hashtable<>();

	if (!table.containsKey("R01")) {
	    table.put("R01", "Kim");
	}
	
	
	1. Hashtable의 주요 메서드가 synchronized라는 것은 무엇을 의미하는가?
	주요 메서드가 동기화 되어있다.
	동기화란 여러 스레드가 같은 공유 데이터에 동시에 접그할 때 실행을 조정하는것
	
	2. containsKey()와 put()이 각각 동기화되어 있는데도, 위 코드 전체를 안전하다고 단정할 수 없는 이유는?
	개별 메서드가 동기화 되어 잇다고 해서 여러 메서드의 조합까지 자동으로 하나의 작업처럼 보호되는것은 아니기 때문
	
	3. 스레드 A와 B가 실행되는 순서를 예시로 작성해서, 최초 예약이 다른 값으로 덮어써지는 상황을 설명해라.
	스레드 A 
	!table.containsKey("R01") = true
	스레드 B 
	!table.containsKey("R01") = true
	스레드 A
	table.put("R01", "Kim");
	스레드 B
	table.put("R01", "Lee");
	하면 스레드A 의 R01의 값이 덮어써짐
	
	4. 일반적인 단일 스레드 환경에서는 HashMap을, 여러 스레드가 동시에 접근하는 공유 Map에서는 ConcurrentHashMap 등을 고려하는 이유는?
	단일 스레드 환경에서는 동기화 비용이 필요 없기 때문
	여러 스레드가 동시에 접근하는 공유 Map에서는 ConcurrentHashMap 동시에 접근시 실행을 조정하는 동기화가 필요하기 때문
	
	상황 B — 예약 데이터 저장 구조
	다음은 실제 예약 요청이야.
	List<Reservation> input = Arrays.asList(
	    new Reservation("R01", 3),
	    new Reservation("R02", 3),
	    new Reservation("R03", 5),
	    new Reservation("R01", 4),
	    new Reservation("R04", 2)
	);
	
	
	요구사항:
	- 동일한 예약 ID는 중복 저장하지 않는다.
	- 중복 ID가 발생하면 최초 예약을 유지한다.
	- 인원 오름차순, 동일 인원일 때 예약 ID 오름차순으로 출력한다.
	답할 것:
	5. 이 요구사항에서 HashMap<String, Reservation>과 ArrayList<Reservation>의 역할을 각각 설명해라.
	HashMap은 중복 제거 , ArrayList는 정렬
	
	6. TreeMap<Integer, Reservation>에 인원을 Key로 사용하면 왜 데이터가 누락될 수 있는가?
	동일한 인원의 예약일 경우 Key의 중복으로 다른 예약이 누락될 수 있음.
	
	7. 최종 정렬 결과를 작성해라.
	[R04(2), R01(3), R02(3), R03(5)] 
	
	8. 실제 DB에서 reservation_id의 중복 저장을 막기 위한 제약조건의 이름과, 애플리케이션에서 containsKey()로 중복 확인하는 것만으로 충분하지 않은 이유를 설명해라.
	DB에서 PRIMARY KEY , UNIQUE 의 유일성 제약조건이 필요, 여러개의 데이터가 동시에 입력될 수 있기 때문에.
	
	 */
}
