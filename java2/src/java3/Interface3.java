package java3;

public class Interface3 {

	public static void main(String[] args) {
		userinfo2 ua = new userinfo2();
		ua.dataea();
		ua.myinfo(null);
	}

}

class userinfo2 implements user1 {
	@Override
	public void mytel(String usertel) {
	}

	@Override
	public void myinfo(String userid) {
		int w = 0;
		while (w < this.dataea()) {
			System.out.printf("아이디:%s 고객명:%s 이메일:%s 지역:%s \n",
					userdata[w][0], userdata[w][1],
					userdata[w][2], user2.infodata[w][2]);
			w++;
		}

	}

	@Override
	public int dataea() {
		return user1.super.dataea();
	}

}
