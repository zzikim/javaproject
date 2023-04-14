package Java2;

import java.util.Arrays;
import java.util.Scanner;

public class Over3 {
	// 메인 실행  //class Over1, method userlist(string), list

	public static void main(String[] args) {
			telcorp m = new telcorp();
			m.userlist("");

		}
}
	

class telcorp extends Over1 {
	int ea;
	@Override
	public void userlist(String username) {
		//System.out.println(Arrays.toString(list[0]));
		super.userlist(username);
		this.ea = this.list.length;
		int w = 0;
		int lcount = 0, kcount = 0, scount = 0;
		while(w<ea) {
			if(list[w][4].equals("lgt")) {				
				lcount ++;
			}
			else if(list[w][4].equals("kt")) {				
				kcount ++;
			}
			else if(list[w][4].equals("skt")) {				
				scount ++;
			}
			w++;
		}
		System.out.printf("SKT : %d명\nKT : %d명\nLGT : %d명",scount,kcount,lcount);
	}
}
