package java3;

public interface Inter1 {
	String names = "홍길동"; // 전역변수
	public void z1();
	default void z1_1(int a, int b) { // 일반메소드 선언 default
		int c = a+b;
		System.out.println(c);
	}
}
