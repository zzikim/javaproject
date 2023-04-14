package Java2;

public class Method15 {
//오버라이드 규칙
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class color1{
	public String abc() {
		return null;
	}
	public boolean zzz(int nm) { //string ->int로 변경
		return true;
	}
	
}

class color2 extends color1{
	public void zzz() { //color2에서 만들어진 메소드 
		
	}
	@Override
	public String abc() {
		// TODO Auto-generated method stub
		return super.abc();
	}
	@Override
	public boolean zzz(int nm) { //무조건 원판 class 메소드를 따라가야함
		// color1 zzz메소드에서 int로 적용을 하였지만
		// color2에서 기존에 있던 string을 유지할 경우 상속 error 발생
		return super.zzz(nm);
	}
}