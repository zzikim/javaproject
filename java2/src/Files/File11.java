package Files;

import java.io.OutputStream;
import java.util.Arrays;

public class File11 {
//OutputStream : 출력담당
// - FileOutputStream,  etc...
	public static void main(String[] args) {
		try {
			load l = new load();
			l.output();
		}
		catch(Exception e)
		{
			System.out.println("메소드 오류");
			}
		
}
}

class load{
	OutputStream os = null; //output 자체가 SysOutprint 필요없음
	public void output() throws Exception {
		String data = "홍길동";
		//byte[] : 문자열을 ASCII형태의 배열로 변경하는것
		byte[] b = data.getBytes(); //getBytes : 문자를 숫자형태로 변환
		System.out.println(Arrays.toString(b));
		this.os = System.out;
		// byte 단위의 배열값을 역으로 해석해서 문자화 시킴
		this.os.write(b,0,b.length); // write(배열,시작값,종료값) 
		this.os.flush(); // 
		//flush : 메모리를 깨끗하게 비워줌
		this.os.close();
	}
}
