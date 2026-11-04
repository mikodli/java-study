package day15;

import java.util.Calendar;
import java.util.Date;

class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();

        cal.set(2026, 10, 4, 15, 30, 0);
        cal.set(Calendar.MILLISECOND, 0);

        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));

        Date date = cal.getTime();

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date);

        System.out.println(
            cal2.get(Calendar.MONTH)
        );
        
        /*
        
        1.출력 5줄은?
		2026
		10
		4
		4
		10
		
		
		2.cal.set(2026, 10, 4, ...)에서 10은 몇 월을 의미하는가?
		11월
	
	
		3.Calendar.MONTH와 LocalDate.getMonthValue()의 차이는?
		월을 나타내는 값의 범위가 다름 
		MONTH(0 ~ 11)
		getMonthValue(1 ~ 12)
	
	
		4.cal.getTime()의 반환 타입은?
		Date
	
	
		5.cal2.setTime(date)는 어떤 역할을 하는가?
		Calendar 타입의 참조변수 cal2 가 참조하는 인스턴스에 날짜를 입력하는 역할        
        
         */

	}

}
