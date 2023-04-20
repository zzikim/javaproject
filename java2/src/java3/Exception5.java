package java3;

public class Exception5 {

	public static void main(String[] args) {
		ex2 e = new ex2();
		try {
			e.loader("ok");
		}
		catch(Exception aa) {
			if(aa.getMessage()!=null) {
				System.out.println(aa);
			}
		}

	}

}

class ex2{
	public void loader(String a) throws Exception{
		//해당 메소드에서 오류가 발생 시 모든 내용이 자신을 호출한 본 클래스에게 전달되어짐
		//자신의 문제사항을 직접 확인하는 방법은 자신 메소드에 try,catch 를 사용하는 방법이 있음.
		try {
		if(a=="ok") {
			String data = "1,000";
			int money = Integer.valueOf(data);
		}
		else {
			System.out.println("데이터 잘못 전달");
		}
		}
		catch(Exception e) {	
			System.out.println(e.getMessage());
			Exception ep = new Exception();
			throw ep;
		}
						
		}
}
