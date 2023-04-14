package Java2;

//사용자 정보 리스트
public class Over1 {
	// 오버라이드를 할 경우 field에 변수를 셋팅해야함
	String list[][] = {
			{"홍길동","hong","서울","hong@nate.com","skt"},
			{"이순신","lee","인천","lee@nate.com","kt"},
			{"강감찬","kang","제주","kang@naver.com","kt"},
			{"장보고","jang","강원","jang@ngmail.com","lgt"}
	};
	public String se;
	public void userlist(String username) {
		this.se = username;
		int money = 10000;
	}
}
