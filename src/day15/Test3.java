package day15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance();

        cal.set(2026, Calendar.NOVEMBER, 4, 15, 30, 0);
        cal.set(Calendar.MILLISECOND, 0);

        Date date = cal.getTime();

        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(sdf.format(date));
        
        /*
        
        
		1. 출력 결과는?
		2026-11-04 15:30:00
		
		2. MM과 mm의 차이는?
		MM은 달 mm은 분
		
		3. HH와 hh의 차이는?
		HH는 24시를 표현 hh은 12시로 표현
		
		4. SimpleDateFormat을 여러 스레드가 공유하면 어떤 문제가 발생할 수 있는가?
		SimpleDateFormat 은 변경 가능한 객체로 날짜 데이터가 원하지 않는 날짜로 변경될 수 있음
		* SimpleDateFormat은 가변 상태를 가지므로 여러 스레드에서 같은 인스턴스를 동시에 사용하면 파싱이나 포맷 결과가 잘못될 수 있음		
		
		5. 현대 Java에서 날짜·시간 포맷에 주로 사용하는 대체 클래스는?
		DateTimeFormatter
        
         */

	}

}
