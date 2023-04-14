package project1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

// 배열데이텨 url: http://mekeyace.dothome.co.kr/product_db.txt
public class Object4 {

	public static void main(String[] args) {
		ob2 ob = new ob2();
		ob.data2();
	}

}

class ob2 {
	ArrayList<Object[]> al;
	Object data[][];
	Scanner sc;
	LinkedList<Object[]> ln;
	int no;
	int count;

	public void data2() {
		ln = new LinkedList<Object[]>();
		this.data = new Object[][] { 
			{ 1, "니베아 데오드란트", 35000 }, 
			{ 2, "파스퇴르 바른목장", 17000 }, 
			{ 3, "해남 꿀고구마", 15300 },
			{ 4, "프리미엄 생 칵테일 새우", 22370 }, 
			{ 5, "쉬슬러 고농축 액체세제", 16620 },
			{ 6, "믹시 삐비 미니캐리어", 99500 }
			};
		this.al = new ArrayList<>(Arrays.asList(this.data));

		int sum = 0;
		String basket="";
		System.out.println(
				"[~~지연 MART 대박세일~~]\n 1. 니베아 데오도란트 \n 2. 파스퇴르 바른목장  \n 3. 해남 꿀고구마  \n 4. 프리미엄 생 칵테일 새우  \n 5. 쉬슬러 고농축 액체세제  \n 6. 믹시 삐비 미니캐리어  \n 7. 선택 종료 \n[~~초초대박 👇 골라골라~~]");
		DecimalFormat df = new DecimalFormat("###,###");
		while (true) {
			try {
				count = this.ln.size();
				sc = new Scanner(System.in);
				System.out.printf("\n ☆ 원하시는 상품을 선택해주세요 (%d/6) : ",count+1);
				no = sc.nextInt();
				if (no <= 7 && no > 0) {
					if (no == 7) {
						if (count < 1) {
							System.out.println("\n지연: (눈물을 글썽이며) 마음에 드는 상품이 없으신가요?ㅠㅠ \n다음번엔 꼭 세계가 놀라고 일본이 질투하는 상품들을 가져오겠습니다.. \nTo be continue...");
							break;
						} else {
							System.out.println("\n[상품선택이 완료되었습니다]");							
							System.out.printf("지연: 총 상품은 %d개 이며, 총 금액은 %s원 입니다. 감사합니다^_^\n    계좌이체 부탁드려요~~ 카드는 남는게 없어요 ㅎㅎ \n    [장바구니 물품: %s]", ln.size(), df.format(sum),basket);
							break;
						}
					} 
					else if (count == 6) {
						System.out.println("장바구니가 가득 찼습니다..");
						break;
					}
					} 
				else {
					System.out.println("\n  그런 번호는 없습니다. 눈 똑바로 뜨고 선택해 주세요 ");
					continue;
				}
				this.ln.add(this.al.get(no - 1));
				System.out.printf("   (+) %s: %s\n", this.ln.get(count)[1], df.format(this.ln.get(count)[2]));
				sum += (Integer) ln.get(count)[2];
				basket += ln.get(count)[1]+",";
			} catch (InputMismatchException aa) {
				System.out.println("\n !!!!!!!!!!!!!!!번호로 입력해주세요!!!!!!!!!!!!!!! ");
				continue;
			}
		}
		this.sc.close();

	}

}
