package java1;

import java.text.SimpleDateFormat;
import java.util.*;

public class index13 {
	public static void main(String[] args) {
		//날짜 출력 형태
		Date today = new Date();
		Scanner sc = new Scanner(System.in);
		System.out.println(today);
		
		//y : 년, M : 월, d : 일
		SimpleDateFormat date = new SimpleDateFormat("YY-MM-dd");
		//H :시간(24시제) h: am,pm , m:분, s:초,  a = 오전,오후 표시
		SimpleDateFormat time = new SimpleDateFormat("H:m:s a");
		SimpleDateFormat datetime = new SimpleDateFormat("yyyy-MM-dd HH:mm:s");
		//format() : 규격화된 형태로 값을 표현할때 사용
		System.out.println(datetime.format(today));
		System.out.println(date.format(today));
		System.out.println(time.format(today));
		
		

		
	}

}
