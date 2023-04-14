package java1;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		String user[] = { "hong", "kim", "park", "jang", "han" };
		Search sh = new Search();
		sh.idcheck(user);
	}

}

class Search {
	public void idcheck(String data[]) {
		int ea = data.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력해 주세요: ");
		String id = sc.next().intern();
		sc.close();
		int w = 0;
		int count = 0;
		while (w < ea) {
			if (id == data[w]) {
				count++;
			}
			w++;
		}
		if (count == 0) {
			System.out.println("미가입자입니다.");
		}

		else {
			System.out.println("해당 아이디를 확인 했습니다.");
		}
	}
}
