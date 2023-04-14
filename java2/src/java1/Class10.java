package java1;

import java.util.Scanner;

public class Class10 {

	public static void main(String[] args) {
		Log a = new Log();

	}

}

class Log {
	int counts = 0;
	String an1;

	public Log() {
		log();
	}

	public void log() {
		if (counts >= 1) {
			an1 = "hong";
		} else {
			an1 = inputs("아이디를 입력하세요");
		}
		if (an1 != "hong") {
			System.out.println("가입되지 않은 사용자입니다.");
			Log a = new Log();
		}

		else {
			an1 = "hong";
			String an2 = inputs("패스워드를 입력하세요");
			passs(an2);

		}
	}

	public String inputs(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		String result = sc.next().intern();
		return result;
	}

	public void passs(String an2) {
		if (an2 != "a123456") {
			counts++;
			System.out.println("패스워드 오류입니다..");
			if (counts >= 3) {
				System.out.println("해당 아이디는 10분 후에 다시 로그인 하실 수 있습니다.");
				counts = 0;
				log();
			} else {
				log();
			}
		} else {
			System.out.println("로그인 되었습니다.");
		}

	}
}
