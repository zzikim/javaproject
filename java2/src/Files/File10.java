package Files;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class File10 {
	//Stream 사용법
	//Stream : 이미지, 동영상, 오디오 등 미디어파일을 로드하기 위해 사용
	/*InputStream(최상위) : 모든 입력 장치에 대한 값을 받는 기본 클래스(int)
	 	- FileInputStream, AudioInputStream, ObjectInputStream
	 	- InputStreamReader : 언어셋을 변경할때만 사용
	  */
	//OutputStream : 모든 출력 장치에 대한 클래스
	public static void main(String[] args) {
		InputStream is = new InputStream() {
			//사용시 오버라이드 메소드 기본적용 (read외는 별도의 메소드 구성 xxx)
			@Override
			public int read() throws IOException {
				int a = 15;
				return a;
			}
			
		};
		try {
			//read 메소드를 호출하여 값을 return받음
		System.out.println(is);
		System.out.println(is.read());
		is.close();
		}
		catch(Exception e){
			
		}
		
		//InputStreamReader(파일 언어셋 변경용) -> FileinputStream
		InputStreamReader ir = new InputStreamReader(is);
		try {
			System.out.println(ir.read());
			ir.close();
		}
		catch(Exception e){
			
			
		}
		
		//키보드값 로드
		InputStream user = System.in;
		try {
			int keycode = user.read();	// 사용자가 입력한 키를 읽어서 ASCII로 변환.
			System.out.println(keycode);
			user.close();
		}
		catch (Exception e){
			
		}
		

	}
	}
