package Java2;
//Method19 연계작업

public class Method18 extends data {
	// main은 오버라이드를 사용 할 수 없음.
	public static void main(String[] args) {
		
		Method17 m = new Method17();
		m.main(args);
		
		md md = new md();
		md.display();		
		
		Method18 mh = new Method18();
		mh.name(); // main 에서는 this 못씀
	}
	
//	@Override // 원본 메소드를 그대로 상속 받는 메소드
//	public void name() {
//		int aa = 10; //오버라이딩
//		super.name();
//		System.out.println("추가 코드 작성"); //오버라이딩 (원래 변수 외 변수)
//	}

}
class md extends pt{ // 외부 class는 오버라이드 가능.
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
	}
}

class data{
	public void name() {
		System.out.println("외부 class data load");
	}
}
