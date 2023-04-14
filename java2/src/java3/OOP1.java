package java3;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class OOP1 {
	// List, ArrayList, LinkedList,, Map(key)
	public static void main(String[] args) {
		mo m = new mo();
		m.result();
	}

}

class mo {
	LinkedList<Integer> ln = new LinkedList<>();
	Scanner sc;
	public void result() {
		int sum = 0;
		int no;
		while (true) {
			try {
				sc = new Scanner(System.in);
				System.out.println("입금할 금액을 입력하세요 : ");
				no = sc.nextInt();
				sum += no;
				this.ln.add(no);
				int count = this.ln.size(); // 배열데이트 갯수 체크
				if(count==8) {
					break; // 무한 loop 종료
					}				
			} catch (InputMismatchException aa) {
				System.out.println("숫자만 이용하여 입력하세요");
				continue;
			}
		}
		this.sc.close();
		
		System.out.println(ln);
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.printf("최종 입금금액 : %s원", df.format(sum));
	}
}
