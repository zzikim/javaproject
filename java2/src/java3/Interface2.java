package java3;

import java.text.DecimalFormat;
import java.util.Scanner;
//user1.java, user2.java 응용편(interface)
//this는 필드에 있는것만 사용 가능
public class Interface2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사용자 아이디를 입력해주세요 : ");
		String id = sc.next();
		sc.close();
		userinfo ui = new userinfo();
		ui.dataea();
		ui.myinfo(id);

	}

}
class userinfo implements user2,user1{
	private int total = 0;
	
	@Override
		public void mytel(String usertel) {}
	@Override
	public int dataea() {
		return user1.super.dataea();
	}
	
	@Override
	public void myinfo(String userid) {
		int count = 0;
		int w = 0;
		
		try {
			System.out.println("잠시만 기다려 주시길 바랍니다.(조회중...)");
			Thread.sleep(5000);			
		}catch (Exception e) {
			
		}
		
		while(w<this.dataea()) {
			if(user2.infodata[w][0].equals(userid)) {
				count++;
			}
			w++;
		}
		if(count==0) {
			System.out.println("등록된 회원이 아닙니다.");
		}
		else {
			DecimalFormat df = new DecimalFormat("###,###"); // 숫자 자료형 스타일 설정
			System.out.println("고객님의 포인트는:"+df.format(Integer.parseInt(this.pointck(userid)))+"점 입니다.");}
		}
	
	@Override
	public String pointck(String userid) {		
		int w = 0;
		while(w<this.dataea()) {
			if(user2.infodata[w][0].equals(userid)) {
				this.total = Integer.parseInt(user2.infodata[w][4]);
			}
			w++;
		}			
		return  Integer.toString(total);
	}
}