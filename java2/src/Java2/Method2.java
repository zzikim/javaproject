package Java2;

import java.util.Arrays;

public class Method2 {

	public static void main(String[] args) {
		test2 t = new test2();

		// 문자로 받아 split으로 나누어 배열처리
		String data1 = t.userinfo1();
		String info[] = data1.split(",");
		System.out.println(Arrays.toString(info));

		// 배열로 해당 값을 모두 받아 처리
		String data2[] = t.userinfo2();
		System.out.println(Arrays.toString(data2));

	}

}

class test2 {
	String user_name = "홍길동";
	String user_id = "hong";

	public String userinfo1() { // 문자열 return method ,기준으로 데이터를 보냄
		String user_info = user_name + "," + user_id;
		return user_info;
	}

	public String[] userinfo2() { // 배열 return method
		String userinfo2[] = { user_name, user_id }; // 배열생성
		return userinfo2; // 배열값 return;
	}
}
