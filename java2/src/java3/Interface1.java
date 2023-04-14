package java3;

public class Interface1 {
// interface 사용법 inter1.java, inter1.java
//interface 특징 : class가 없음(추상메소드)
	public static void main(String[] args) {
		key k = new key();
		k.z1();
		k.z2();
		k.z3();
	}

}
//interface 상속을 받기 위해서는 implements를 이용함
/*
 interfce는 부품이며, 해당 부품을 조립하여 프로그램을 완성하는 형태
 또한 여러개의 interface를 한번에 로드할 수 있음.
 
  interfce에는 일반메소드 생성 불가
  단, default 이용 시 강제로 메소드 생성 가능
  
  동일한 변수 사용 시 this를 사용하지 못하며, 해당 인터페이스 메소드 이름을 입력 후 해당 변수 명을 적용해야 합니다.
 */
class key implements Inter1, Inter2{
	@Override
	public void z1_1(int a, int b) {
		Inter1.super.z1_1(a, b);
	}
	
	@Override
	public void z1() {
		System.out.println(Inter1.names);		
	}
	@Override
	public void z2() {
		System.out.println(Inter1.names);		
	}
	@Override
	public String z3() {
		System.out.println(Inter2.names);	// 하나만 있으면 this 사용 가능
		return null;
	}
	
}