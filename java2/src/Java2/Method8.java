package Java2;

import java.util.Arrays;
import java.util.Base64;

public class Method8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		apple2 ap = new apple2();
		ap.userinfo(); // setter 실행
		ap.myinfo(); // getter 값을 받아서 처리하는 메소드 실행
	}

}

class apple1 {
	private String userid = "";
	private String userpw = "";
	private String useremail = "";
	private String userpw2 = "";

	public void userinfo() { // setter -> 데이터 넣어줌
		this.userid = "kim";
		this.userpw = "a123456";
		//Base64.getEncoder() : 문자를 특수 형태의 문법으로 인코딩 하는것을 말함.
 		this.userpw2 = Base64.getEncoder().encodeToString(this.userpw.getBytes()); // 암호화의 기본코드		
		this.useremail = "kim@naver.com";
	}

	public String[] user() { // getter -> 데이터 내보내는 작업
		String data[] = new String[3];
		data[0] = this.userid;
		data[1] = this.userpw2;
		data[2] = this.useremail;
		return data;
	}

}

class apple2 extends apple1 { // 상속
	String aa[] = { "s", "o", "n" };

	public void myinfo() {
		String list[] = this.user();
		System.out.println(Arrays.toString(list));
		System.out.println(Arrays.toString(aa));
	}

}