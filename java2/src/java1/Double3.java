package java1;

import java.util.Scanner;

public class Double3 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int w = 1;
		int count = 0; //짝수갯수 확인
		int sum = 1; //곱하는 변수
		while(w<4) {
			System.out.println("숫자를 입력하세요:");
			int a = num.nextInt();
			num.close();
			if(a%2==0){ //사용자가 입력한 값이 짝수인지 조건확인
				count++; //짝수일 시 카운팅
				sum*=a; //짝수값 지속적 곱하기
			}
			w++;
		}
		if(count < 2) {
			System.out.println("짝수를 최대 두개 이상 입력하세요.");
		}
		else {
			System.out.println("최종합계: "+sum);
		}

	}

}
