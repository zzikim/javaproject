package java1;

public class Class8 {
	//오버라이드(override)
	//같은 이름의 메소드이며 인자값 갯수/형태(string, int) 로 구분하여 설정하는것을 말함
	public static void main(String[] args) {
		Class8 z = new Class8();
		z.abc("홍길동");
		z.abc("홍길동","강감찬");
		z.abc("이순신","장보고","유관순");

	}

	public void abc(String a) {
		System.out.println(a);
	}
	
	public void abc(String a,String b) {
		System.out.println(a);
		System.out.println(b);
	}
	
	public void abc(String a, String b, String c) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
