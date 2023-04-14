package java1;

import java.util.Arrays;

public class Class_araay1 {
	// 외부 파일에 있는 class + array (배열)
	// Data1.java와 함께 사용

	// Data1.java 실행
	public static void main(String[] args) {
		Data1 db = new Data1(); // 외부파일 class 로드
		System.out.println(Arrays.toString(db.user)); // 외부 전역변수 값 출력
		db.userlist(); // 외부 파일 메소드 호출
		System.out.println(db.number);
		// 메소드를 호출 후 전역변수 값과 호출 전 전경변수 값이 다름
	}

}
