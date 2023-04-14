package example;

import java.util.Arrays;
import java.util.Scanner;


public class Example9 {
	String data[][] = {
			{"콜라","사이다","환타","포카리"},
			{"500","500","600","800"}
	};

	public static void main(String[] args) {
		Example9 ex = new Example9();
		ex.result();
	}

	public void result() {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("금액을 입력하세요:");
		int mo = sc.nextInt();		
        System.out.println("다음 메뉴를 선택하세요: "+Arrays.toString(data[0]));
        String dr = sc.next();
        int ea = this.data[0].length;
		int w = 0;
		int total = 0;
		while(w<ea) {					
			if(dr.equals(this.data[0][w])) {
				total  = mo-Integer.parseInt(this.data[1][w]);
			}
			w++;
		}
		sc.close();
		if(total<0) {
			System.out.println("금액이 모자릅니다.");
		}
		else {
			System.out.println("최종 남은 금액은 "+total+"원 입니다.");
		}
        	
		
	}
}
