package java3;

public class Abstract1 {
// 추상 클래스 (가상클래스)
	public static void main(String[] args) {
		box2 bb = new box2();
		bb.sbox();

	}

}

class box2 extends box {
	@Override
	public void sbox() {
		System.out.println("테스트 입니다.");
	}
	
	@Override
	String result() {
		// TODO Auto-generated method stub
		return null; 
	}
}

//abstract = 추상 메소드가 존재하며, 해당 추상 메소드를 사용하지(오버라이드)않을 경우 에러발생 
abstract class box {
	abstract public void sbox();	//추상 메소드
	abstract String result();		//추상 리턴 메소드
}