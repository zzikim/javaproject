package java1;

import java.util.Scanner;

public class index7 {

	//하나의 객체로 여러번 사용하는 형태
	public static void main(String[] args) {

		Scanner bb = new Scanner(System.in);
		System.out.printf("Q. 입금할 금액을 적어주세요.");
	    int money = bb.nextInt();	
	    System.out.println("Q. 입금잔행 하시겠습니까?");
	    String result = bb.next(); // 동일한 객체를 실행시킴
	    System.out.println("입금처리 되었습니다.");
	    
	    bb.close(); // close 는 한번 실행시 해당 객체를 더이상 사용하지 못함.
	    

	}

}
