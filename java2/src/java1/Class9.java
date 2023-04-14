package java1;

import java.util.Scanner;

public class Class9 {

	public static void main(String[] args) {
		Room z = new Room();

	}

}

class Room {
	public Room() {
		Scanner sc = new Scanner(System.in);
		System.out.println("원하시는 방의 번호를 입력하세요.");
		System.out.println("1.무지개룸  2.패밀리룸  3.달빛아래룸");
		int rmn = sc.nextInt();
		que(rmn);
	}

	int pr;

	public void que(int no) {
		if (no >= 4 || no <= 0) {
			System.out.println("올바른 값이 아닙니다.");
			Room z = new Room();
		} else {
			switch (no) {
			case 1:
				System.out.println("무지개룸: 60,000원");
				pr = 60000;
				break;
			case 2:
				System.out.println("패밀리룸: 125,000원");
				pr = 125000;
				break;
			case 3:
				System.out.println("달빛아래룸: 100,000원");
				pr = 100000;
				break;
			}
			Scanner sc = new Scanner(System.in);
			System.out.println("30% 할인쿠폰을 적용하시겠습니까?(y/n)");
			String rs = sc.next();
			if (rs.equals("y") || rs.equals("n")) {
				que(pr, rs);
			} else {
				System.out.println("y,n으로 응답해주세요.");
				que(no);
			}
		}
	}

	public void que(int pr, String sales) {
		if (sales.equals("y")) {
			System.out.println("최종가격: " + (int) Math.round(pr - (pr * 0.3)) + "원");
		} else if (sales.equals("n")) {
			System.out.println("최종가격: " + pr + "원");
		}
	}
}