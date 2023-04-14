package project1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		game1 gg = new game1();
		gg.rdg();

	}

}

class game1 implements Random {
	Scanner sc;
	String result;
	int num;
	int count = 1;
	int number;
	
	@Override
	public void rdg() {
		number = (int) Math.ceil(Math.random() * 10);
		while (true) {
			try {
				if(count>4) {System.out.println("정답을 맞추지 못했습니다."); break;}
				else {
			sc = new Scanner(System.in);
			System.out.printf("숫자를 선택해 주세요(1~10) [기회 : %d/4]",count);
			num = sc.nextInt();
			if(num>=1&&num<=10) {
			System.out.println(rd(num));			
			if(rd(num).equals("정답")){
				break;}
			else {count++;}
			}
				else {System.out.println("\n 1~10 사이의 숫자를 입력하세요");
				continue;}
				}}
			catch (InputMismatchException aa) {
				System.out.println("\n !!!!!!!!!!!!!!!숫자를 입력해주세요!!!!!!!!!!!!!!! ");
				continue;
			}
	}
		
	}

	@Override
	public String rd(int no) {
		if (no == number) {
			result = "정답";
		} else {
				if (no > number) {
					result = "Down";
				}

				else if (no < number) {
					result = "Up";
				}
			}
		

		return result;
	}
}