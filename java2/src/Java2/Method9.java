package Java2;

import java.util.Scanner;

public class Method9 { // method10과 연계
	static String msg[] = { "검색할 학생명을 입력해 주세요 : ", "검색할 과목명을 입력하세요 [전체,국어,수학,과학,역사] :" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Method10 mt = new Method10();
		System.out.println(msg[0]);
		String user = sc.next();
		System.out.println(msg[1]);
		String subject = sc.next();
		sc.close();
		mt.score(user,subject);

	}

}
