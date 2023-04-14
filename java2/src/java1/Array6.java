package java1;

import java.util.Arrays;
import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		/*String Data[] = { "햄버거", "피자", "치킨", "라면", "김밥", "커피" };
		Scanner sc = new Scanner(System.in);
		int w = 0;
		int no = 0;
		String Total[] = new String[6];
		while (w < Data.length) {
			System.out.println("주문할 음식을 선택해 주세요 :");
			System.out.println("1.햄버거, 2.피자, 3.치킨, 4.라면, 5.김밥, 6.커피, 7.주문종료");
			int select = sc.nextInt();
			if (select == 7) {
				System.out.println("종료");
				break;
			} else {
				Total[no] = Data[select - 1];
				no++;
			}
			w++;
		}
		sc.close();
		System.out.println(Arrays.toString(Total));*/
		
		String menu[] = {"햄버거","피자","치킨","라면","김밥","커피","주문완료"};
	      int ea = menu.length;
	      String[] mymenu = new String[ea]; //사용자가 선택한 값을 입력시키기 위한 빈배열 변수
	      
	      Scanner m = new Scanner(System.in);
	      System.out.printf("1.%s 2.%s 3.%s 4.%s 5.%s 6.%s",menu[0],menu[1],menu[2],menu[3],menu[4],menu[5]);
	      
	      int ct = 0; //배열번호
	      for(String f : menu) {
	         System.out.println("\n메뉴를 선택해 주세요? :");
	         String s = m.next();
	         if(s.equals("7")) {
	            System.out.println("주문종료");
	            break;
	         }
	         else {
	            //Integer.parseInt : 문자를 숫자로 변경
	            int my = Integer.parseInt(s)-1; 
	            mymenu[ct] = menu[my];
	            ct++;
	         }
	      }
	      System.out.println(Arrays.toString(mymenu)); //배열 내용 출력하기
	      m.close();   


	}

}
