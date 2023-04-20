package Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class File13 {
	// 파일생성
	public static void main(String[] args) {
		try {
		File fi = new File("E:\\git_java\\javaproject\\java2\\src\\Files\\\\abc.txt");
		if(fi.exists()==false) { //해당경로의 파일 유무 체크
			fi.createNewFile();	//파일 생성
		}
		String data = "홍길동"; // 데이터
		OutputStream os = new FileOutputStream(fi); //파일 저장 경로
		byte[] b = data.getBytes(); //데이터를 byte단위로 생성
		os.write(b); //파일에 쓰기
		os.flush();
		os.close();
		
		}
		catch(Exception e) {
			
		}
	}

}
