package Java2;

public class Method7 {

	public static void main(String[] args) {
		box2 b = new box2();
		b.list();
		b.list2();

	}
}

	class box1{
		public String user_id;
		private String user_pw; // 상속 못하는 변수 선언
		public void list() {
			this.user_id = "hong";		}
		//private를 직접 핸들링 불가함으로 return을 이용하여 box2가 핸들링 할수있게 함
		public String pw() { //getter
			this.user_pw = "a123456";
			return this.user_pw;
		}
	}


class box2 extends box1{ //extends : box1을 상속받아서 box2에서 진행
		//상속을 이용할 경우 같은 메소드 이름은 사용하지 않음
	//private는 상속 받을 수 없음
	public void list2() {
		String pass = pw();
		System.out.println(this.user_id);
	}
}
