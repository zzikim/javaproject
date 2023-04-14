package java1;

import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		Member2 mb = new Member2();
		mb.list("김지연", 3);

		Scanner gu = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int g = gu.nextInt();
		mb.gugu(g);
		
	}
	
	

}

class Member2{
	//일반 메소드는 인자값을 복합적으로 적용할 수 있음
	public void list(String user, int level) {
	System.out.printf("고객명: %s, 레벨: %d\n",user,level); 
	}
	public void gugu(int a) {
		int w = 9;
		do {
			System.out.printf("%d * %d = %d\n",a,w,(a*w));
			w--;}while(w>=1);
	}
	
}
