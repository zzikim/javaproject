package java1;

import java.util.Scanner;

public class Class_array2 {
	// 2개 배열값 - Scoring.java 연계
	public static void main(String[] args) {
		String a1[] = { "홍길동", "이순신", "강감찬", "유관순", "김유신" };
		String a2[] = { "100", "80", "39", "42", "55" };
		Scanner sc = new Scanner(System.in);
		System.out.println("검색하고자 하는 이름을 적어주세요? :");
		String a = sc.next().intern();
		Scoring scr = new Scoring();
		scr.sco(a, a1, a2);

	}

}
