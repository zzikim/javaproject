package java3;

public class OOP2 {
	public static String datas = "홍길동";
	// 변수선언 (전역변수, 지역변수) - 변수선언하는 구역이 중요함
	public static void main(String[] args) {
		vars v = new vars();
		v.abc();
	}

}

class vars{
	public void abc() {
		int a = 10;
		if(a==10) {
			int b = 30; // if문 안에서 생성된 변수는 다른 문법에서 사용불가
		}
		int w = 0;
		while(w<b) { // b 변수를 가져올 수 없음
			int sum = 5000; // while문 안에서 생성된 변수
			System.out.println(b); 
			w++;
		}
		System.out.println(sum); // 출력되지 않음
		System.out.println(OOP2.datas);
	}
}