package day15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class LastTest12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "2026-11-04";

        LocalDate date =
                LocalDate.parse(input);

        LocalDate nextDay =
                date.plusDays(1);

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern(
                    "yyyy/MM/dd"
                );

        System.out.println(date);
        System.out.println(nextDay);
        System.out.println(nextDay.format(formatter));

        String text = "2026/12/25 18:30";

        DateTimeFormatter parser =
                DateTimeFormatter.ofPattern(
                    "yyyy/MM/dd HH:mm"
                );

        LocalDateTime parsed =
                LocalDateTime.parse(text, parser);

        System.out.println(parsed);
        
        /*
        
		1. 출력 4줄은?
		2026-11-04
		2026-11-05
		2026/11/05
		2026/12/25T18:30
		
		2. LocalDate.parse(input)이 별도 패턴 없이 동작하는 이유는?
		LocalDate.parse()는 기본적으로 ISO_LOCAL_DATE 형식을 사용하기 때문
		
		3. LocalDate.parse("2026/11/04")를 기본 파서로 실행하면 어떻게 되는가?
		DateTimeParseException 에러가 발생
		
		4. parse()와 format()의 차이는?
		parse()은 String을 날짜 형태로 변경
		format()은 파싱하는 형태를 변경
		
		5. MM과 mm의 차이는?
		MM은 달 mm은 분
		
		6. DateTimeFormatter는 스레드 안전한가?
		DateTimeFormatter은 불변으로 생성된 인스턴스의 변화가 없기 때문에 안전
		
		7. date.plusDays(1)을 실행한 뒤 기존 date는 변경되는가?
        DateTimeFormatter은 불변으로 date 기존 객체에 plusDays(1)을 한 새로운 객체를 반환
        
         */
		
	}

}
