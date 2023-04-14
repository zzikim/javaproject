package Java2;

public class Method11 {

	// 상속메소드형태2
	public static void main(String[] args) {
		student st = new student();
		st.info("홍길동", "서른");
		st.print();
	}

}
class person{
	protected String name; //protected = 같은클래스,같은패키지 및 상속클래스 모두 접근 가능 단, 외부 별도 클래스에서는 작동 불가
	protected String age;
	//setter
	public void info(String name, String age) {
		this.name = name;
		this.age = age;
	}
	public void print() {
		System.out.printf("이름은 %s,",this.name);
	}
}
class student extends person{
	@Override   // 동일한 이름과 인자값을 가진 메소드를 표시
	public void print() {
		super.print(); // 상속받는 메소드를 정의함(값, 처리사항)
		System.out.printf(" 나이는 %s살",this.age);
	}
}
	
