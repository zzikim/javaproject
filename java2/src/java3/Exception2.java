package java3;

public class Exception2 {

	public static void main(String[] args) {
		try {
			Exception2 ex = new Exception2();
			String data = "홍길동"; // (1) : 문자열 데이터 입력
			ex.test(data); // (2) : 외부 메소드로 값을 전달
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("문제발생");
		}
	}
	// throws = main method에서 예외처리 없이 해당 메소드를호출할 경우를 박기위해서 사용
	public void test(String b) throws Exception {
		int k = Integer.valueOf(b);
		System.out.println(k);
		Exception c = new Exception();
		throw c;
		// 코드의 맨 밑에 사용하며 throw = return과 비슷한 성격을 가짐.
		// 예외처리 결과에 대한 값을 매인 메소드로 다시 return시킴
	}

}
