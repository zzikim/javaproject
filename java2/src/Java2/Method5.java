package Java2;

import java.util.Arrays;

public class Method5 {
	// private 관련사항 (변수 설정) + 배열값 추가
	public static void main(String[] args) {
		apink a = new apink();
		a.test();
	}

}

class apink {
	// private 선언 변수는 무조건 class field에만 사용 가능.
	private String user[] = { "1", "2", "3", "4", "5" };

	public void test() {
		String user2[] = new String[this.user.length + 1]; // 데이터 한개 더 추가
		int w = 0;
		while (w < this.user.length) { // 기존 배열 값 전달
			user2[w] = user[w];
			w++;
		}
		user2[this.user.length] = "6"; // 새로운 데이터 추가
		System.out.println(Arrays.toString(user2));
	}
}
