package example;

import Java2.mssql; // 외부 클래스 로드

public class Example10 {

	public static void main(String[] args) {
		Java2.mssql ms = new mssql();
		ms.abc(); // 외부 메소드 로드
		
		ms.main(args); // 외부 메소드 메인 로드
		String result = ms.bbb();
		System.out.println(result);
	}

}
