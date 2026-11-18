package day20;

import java.util.*;
import java.io.*;

class Test1 {
    public static void main(String[] args) throws Exception {

        String config =
                "db.host=localhost\n" +
                "db.port=5432\n" +
                "app.name=Reservation\n";

        Properties props = new Properties();

        // TODO 1:
        // StringReader와 load()를 사용해
        // config 문자열을 Properties로 읽어라.
        StringReader configReader = new StringReader(config);
        props.load(configReader);
        
        
        // TODO 2:
        // db.host 출력
        System.out.println(props.getProperty("db.host"));
        
        
        // TODO 3:
        // db.port 출력
        System.out.println(props.getProperty("db.port"));
        
        // TODO 4:
        // 설정에 존재하지 않는 db.timeout을 조회
        // 기본값은 "30"으로 지정
        System.out.println(props.getProperty("db.timeout", "30"));

        // TODO 5:
        // app.name을 "FarmReservation"으로 변경
       props.setProperty("app.name", "FarmReservation");
        
        System.out.println(props.getProperty("app.name"));
    }
    
    /*
		1. TODO 1~5를 직접 구현해라.
		
		
		2. 출력되는 전체 4줄을 작성해라.
		localhost
		5432
		30
		FarmReservation

		
		3. getProperty("db.timeout", "30")에서 "30"은 언제 반환되는가?
		key가 db.timeout이 없을때 default로 30이 반환
		
		4. Properties는 어떤 클래스를 상속받는가?
		Hashtable 클래스를 상속
		
		5. Properties는 내부적으로 Hashtable<Object, Object>를 상속받는데, 왜 설정 관리에서는 setProperty()와 getProperty()를 사용하는가?
		setProperty()와 getProperty() 는 단순히 Hashtable의 put,get 메서드를 호출 함
		
		
		6. load()와 store()의 역할을 각각 설명해라.
		load()는 지정된 객체로 부터 목록을 읽어서 저장함.
		store는 저장된 목록을 특정 Write,OutputStream에 출력함
		
		7. 데이터베이스 비밀번호 같은 민감한 설정값을 다룰 때 소스 코드에 직접 작성하는 방식은 왜 피해야 하는가?
		우회 접근으로 소스 코드에 접근을 할 수 있는 위험이 있기 때문.
		 
     
     */
}
