package day15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class LastTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Calendar cal = Calendar.getInstance();

        cal.set(2026, Calendar.NOVEMBER, 4, 18, 5, 9);
        cal.set(Calendar.MILLISECOND, 0);

        Date date = cal.getTime();

        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(sdf.format(date));
        
        /*
        
		1. 출력 결과는?
		2026-12-04 18:05:09
		
		2. MM과 mm의 차이는?
		MM은 달 mm은 분
		
		3. HH와 hh의 차이는?
		HH는 24시간으로 표현 hh는 12시간으로 표현
		
		4. SimpleDateFormat 인스턴스를 여러 요청 처리 스레드가 공유하면 어떤 문제가 발생할 수 있는가?
		SimpleDateFormat은 가변 상태를 가지므로 여러 스레드에서 같은 인스턴스를 동시에 사용하면 파싱이나 포맷 결과가 잘못될 수 있음
		
		5. DateTimeFormatter가 이런 상황에서 더 적절한 이유는?
		DateTimeFormatter는 불변으로 같은 인스턴스를 동시에 사용해도 인스턴스 자체의 내용은 변경되지 않기 때문에 동일한 결과값을 얻을 수 있음
        
         */
		
	}

}
