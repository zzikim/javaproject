package java1;

import java.util.Scanner;

public class Random1 {
	// random method 이용법 + 재귀method(자신의 method호출 및 다른 method 호출)
	public static void main(String[] args) {
		int number = (int) Math.ceil(Math.random() * 10);
		System.out.println(number);
		/*
		 * Math.ceil : 올림 Math.floor : 절삭 Math.round : 반올림
		 */
		game g = new game();
		g.pc();
	}

}

class game {
	Scanner sc = new Scanner(System.in);
	// this는 해당 class 안에서 사용되는 모든것을 지칭함.
	public game() {
		System.out.println("1~5까지 숫자 중 하나를 입력하세요");
	}

	public void pc() {
		// 1 ~ 5 무작위 선택
		int ai = (int) Math.ceil(Math.random() * 5);
		int person = this.sc.nextInt();
		if (person == ai) {
			System.out.println("로또 사세요");
			this.sc.close();
		} else {
			System.out.println("꽝!! 다시 입력하세요");
			this.pc(); // 재귀함수로 자신의 method를 재호출
		}

	}

}