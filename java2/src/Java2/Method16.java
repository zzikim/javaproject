package Java2;

// 클래스 안으ㅔ 클래스
public class Method16 {

	public static void main(String[] args) {
		green g = new green();
		g.setter(10,20);
		green.blue gb = g.new blue();
		gb.print();
	}

}

class green {	// 부모 class
	int aa, bb;
	String name = "홍길동";
	String userage;
	public void setter(int a, int b) {
		this.aa = a;
		this.bb = b;
		blue gb = new blue();
		System.out.println(gb.age);

	}
	public void pt() {
		System.out.println(this.userage); // 자식 데이터값 출력
	}
	class blue{	// 자식 class
		String age = "30";
		int a1 = green.this.aa; // 해당 필드에 class 변수 선언 (this 사용 필수)
		int b1 = green.this.bb;
		public void print() {
			green.this.userage = "30";
			System.out.println(green.this.name);
			System.out.println(a1*b1);
			green.this.pt(); // 부모 메소드 호출
		}
	}
}