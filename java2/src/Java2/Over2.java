package Java2;

import java.util.Arrays;
import java.util.Scanner;

public class Over2 {
	// 메인 실행  //class Over1, method userlist(string), list
	public static void main(String[] args) {
		myinfo m = new myinfo();
		Scanner sc = new Scanner(System.in);
		System.out.println("이름? ");
		String nm = sc.next();
		m.userlist(nm);

	}

}

class myinfo extends Over1 {
	int ea;
	@Override
	public void userlist(String username) {
		//System.out.println(Arrays.toString(list[0]));
		super.userlist(username);
		this.ea = this.list.length;
		int w = 0;
		int count = 0;
		while(w<ea) {
			if(list[w][0].equals(username)) {				
				count = 1;
				System.out.println(Arrays.toString(list[w]));
				break;
			}
			w++;
		}
		if(count==0) {System.out.println("존재하지않음");}
		
		//System.out.println(this.se);
		// System.out.println(this.money); override 사용 시 변수 사용하려면 필드에 올려야함
	}
}