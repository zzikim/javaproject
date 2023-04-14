package java1;

import java.util.Scanner;

public class Class7 {
	// 회원가입 시 약관 동의 및 간편회원 가입 진행

	public static void main(String[] args) {
		Ag aa = new Ag();

	}

}

class Ag {
	public Ag() {
		agree();
	}

	public void agree() {
		String ag1 = inputs("회원가입 약관에 동의 하시겠습니까?(y/n): ", "");
		if (ag1.equals("y")) {
			String ag2 = inputs("아이디를 입력하세요: ", "");
			if (ag2.equals("admin")) {
				System.out.println("해당 아이디는 중복되었습니다.");
				ag2 = inputs("아이디를 입력하세요: ", "");
			}
			String ag3 = inputs("패스워드를 입력하세요: ", "");
			String ag4 = inputs("가입자명을 입력하세요: ", "y");
			System.out.printf("아이디: %s, 패스워드:%s, 가입자명:%s 가입이 완료되었습니다.", ag2, ag3, ag4);
		} else {
			System.out.println("회원가입이 취소 되었습니다.");
			System.exit(0);
		}
	}

	public String inputs(String msg, String exit) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		String result = sc.next();
		if (exit.equals("y")) {
			sc.close();
		}
		return result;
	}
}

/*
 * class Ag{ String id1; String pw1; String na1;
 * 
 * public Ag() { Scanner a = new Scanner(System.in);
 * System.out.println("회원가입 약관에 동의하시겠습니까? (y/n)"); String yn =a.next();
 * if(yn.equals("n")||yn.equals("N")) { System.out.println("회원가입이 취소 되셨습니다.");
 * System.exit(0); } else if(yn.equals("y")||yn.equals("Y")) { que(); } else {
 * System.out.println("(y/n 중 선택해주세요)"); Ag aa = new Ag(); } a.close(); }
 * 
 * 
 * public void que() { Scanner a = new Scanner(System.in);
 * System.out.println("아이디를 입력하세요."); id1 =a.next().intern(); if(id1=="admin")
 * {System.out.println("중복된 아이디 입니다.");} else {
 * System.out.println("패스워드를 입력하세요."); pw1 =a.next().intern();
 * System.out.println("가입자명을 입력하세요."); na1 =a.next().intern(); a.close();
 * System.out.printf("아이디: %s, 패스워드:%s, 가입자명:%s 가입이 완료되었습니다.",id1,pw1,na1);} } }
 */