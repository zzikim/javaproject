package project1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		customer ct = new customer();
		ct.points();

	}

}

class customer {
	String data[] = { "서울", "경기", "인천", "대전", "충북", "충남", "전북", "전남" };
	LinkedList<String> cos;
	Scanner sc;
	String result;
	Map<String, Integer> map;
	int poin;
	int number;

	public void points() {
		map = new HashMap<>();
		cos = new LinkedList<>(Arrays.asList(this.data));
		int w = 0;
		while (w < cos.size()) {
			try {
				sc = new Scanner(System.in);
				System.out.printf("%s 님에게 포인트를 추가하겠습니까?", cos.get(w));
				poin = sc.nextInt();
				this.map.put(cos.get(w),poin);
				w++;
			} catch (InputMismatchException aa) {
				System.out.println("\n 포인트는 숫자로 입력해주세요 ");
				continue;
			}

		}
		int ww = 0;
		System.out.println("\n[최종결과정보]");
		while(ww<this.map.size()) {
			System.out.printf("%s : %d \n",cos.get(ww),map.get(cos.get(ww)));
			ww++;
		}
	}
}