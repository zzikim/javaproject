package java1;

import java.util.Arrays;
import java.util.Scanner;

public class Array13 {

	public static void main(String[] args) {
		String lists = "";
		Scanner sc = new Scanner(System.in);
		int f;
		//반복문 없이 사용 = nextLine
		//String id = sc.nextLine();
		//lists = id;
		
		for(f=0;f<=4;f++) {
			System.out.println("학급 학생 아이디를 입력해주세요: ");
			String id = sc.next();
			lists += id + "";
		}
		System.out.println(lists);
		//split : 문자열 또는 숫자열을 특정 문자 기준으로 배열화 하는 명령어
		String userdata[] = lists.split("");
		sc.close();
		System.err.println(Arrays.toString(userdata));

	}

}