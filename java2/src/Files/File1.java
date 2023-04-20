package Files;

import java.io.FileReader;
import java.io.IOException;

public class File1 {
	/*
	 I/O : inputStream, OutputStream
	 
	 Input stream : 프로그램으로 들어오는 부분( 키보드, 마우스, hdd-저장되는파일)
	 Output stream : 프로그램으로 나가는 부분 (모니터,hdd,프린터)
	 stream : API 라이브러리를 사용하는 형태
	 JAVA.io (API)
	 
	 (일반 : File, FileReader) -> StreamAPI (FileinputStream)
	 (일반 : FileWriter) -> StreamAPI(FileoutputStream)
	 
	  */
	public static void main(String[] args) throws IOException{
		//IO는 throws 또는, try-catch를 무조건 사용해야함 
		//Filereader = 문자 데이터를 파일로부터 읽어오는 클래스
		//파일 이름을 생성자 인수값(파라미터)로 사용해서 Filereader 객체를 생성.
		try {
		FileReader fr = new FileReader("E:\\git_java\\javaproject\\java2\\src\\Files\\message.txt");
		while(true) {
			int m = fr.read();
			System.out.println((char)m);
			if(m==-1) {
				break;
			}
		}
		fr.close();
		}
		catch(Exception e) {			
		}

	}

}
