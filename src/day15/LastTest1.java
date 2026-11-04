package day15;

import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;


class LastTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Calendar cal = Calendar.getInstance();

	        cal.set(2026, Calendar.DECEMBER, 25, 10, 0, 0);
	        cal.set(Calendar.MILLISECOND, 0);

	        Date date = cal.getTime();

	        Calendar copy = Calendar.getInstance();
	        copy.setTime(date);

	        LocalDate localDate =
	                LocalDate.of(2026, 12, 25);

	        System.out.println(cal.get(Calendar.MONTH));
	        System.out.println(copy.get(Calendar.MONTH));
	        System.out.println(localDate.getMonthValue());
	        System.out.println(localDate.getDayOfWeek());
	        
	        /*
	        
			1. 출력 4줄은?
			11
			11
			12
			FRIDAY			
			
			2. Calendar.MONTH가 11인 이유는?
			MONTH의 범위가 0 ~ 11이고 12월을 set해서 11로 출력
			
			3. Calendar.DAY_OF_WEEK와 LocalDate.getDayOfWeek()는 반환 타입과 표현 방식이 어떻게 다른가?
			Calendar.DAY_OF_WEEK은 일-1 월-2 화-3 수-4 목-5 금-6 토-7 를 int로 반환
			LocalDate.getDayOfWeek()은 요일그자체를 반환  DayOfWeek 열거형
			
			4. cal.getTime()은 어떤 타입을 반환하는가?
			Date타입
			
			5. copy.setTime(date)는 새로운 Calendar 객체를 생성하는가, 기존 객체의 날짜·시간을 설정하는가?
			기존 객체의 날짜 시간을 설정
	        
	         */
		
	}

}
