package day15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        String input = "2026/11/04";

        LocalDate date =
                LocalDate.parse(input);

        LocalDate nextWeek =
                date.plusWeeks(1);

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern(
                    "yyyy/MM/dd"
                );

        System.out.println(date);
        System.out.println(nextWeek);
        System.out.println(nextWeek.format(formatter));

        String text = "2026/12/25 18:30";

        DateTimeFormatter parser =
                DateTimeFormatter.ofPattern(
                    "yyyy/MM/dd HH:mm"
                );

        LocalDateTime dateTime =
                LocalDateTime.parse(text, parser);

        System.out.println(dateTime);
        
        /*

		1. 출력 4줄은?
		2026-11-04
		2026-11-11
		2026/11/11
		2026/12/25T18:30
		
		2. parse()는 어떤 역할을 하는가?
		String을 날짜형식으로 변경
		
		3. format()은 어떤 역할을 하는가?
		반환하는 값의 형태를 변경
		
		4. "MM"과 "mm"의 차이는?
		MM은 달 mm은 분
		
		5. LocalDate.parse(input)이 별도 포맷 지정 없이 가능한 이유는?
		LocalDate.parse()는 기본적으로 ISO_LOCAL_DATE 형식을 사용
		
		6. DateTimeFormatter는 스레드 안전한가?
		불변으로 스레드가 안전함
		
		7. date.plusWeeks(1) 이후 기존 date 객체의 내용은 변경되는가?
		객체의 내용은 변경되지 않고 plusWeeks 후 나오는 결과를 새로운 객체로 반환
       	
         */
		
	}

}
