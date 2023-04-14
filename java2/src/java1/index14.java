package java1;

import java.util.Scanner;

public class index14 {
		//할인율 구하는 공식
	public static void main(String[] args) {
		int money = 10000;
		int coupon = 20;
		double a = coupon*0.01;
		double b = money * a;
		double c = money - b;

		int total = (int)Math.round(c);
		//(int)란 double 자료형 변환 시킬때 사용
		System.out.println(total);
		double sum = money-(money*(coupon*0.01)); //한줄로 공식 쓰기
		System.out.println(sum)
		;
		
		Scanner sales = new Scanner (System.in); 
		System.out.println("총 상품금액 50,000원. 할인쿠폰을 얼마 적용할까요?");
		int aa = sales.nextInt();
		int prices = (int)Math.round(50000-(50000*(aa*0.01)));
		System.out.printf("최종 상품금액은 %d원 입니다.",prices);
		sales.close();
		
		
	}

}
