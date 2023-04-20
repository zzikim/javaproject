package Files;

import java.io.FileReader;
import java.nio.charset.Charset;

public class File2 {

	public static void main(String[] args){
		try {
			
			//Charset.forName("EUCKR") : 인코딩 언어셋을 변경할 때 사용. 출력형태 언어셋만 바꾸는 명령어. 
			//ANSI = EUCKR
			
		FileReader fr = new FileReader("E:\\git_java\\javaproject\\java2\\src\\Files\\agree.txt",Charset.forName("EUC_KR"));
		System.out.println(fr.getEncoding()); //file encoding language check.
		System.out.println(fr.read()); //file data's size
		

		while (true) {
			int a = fr.read();
			if (a == -1) {
				break;
			} else {
				if (a == 32) {
					System.out.printf(" ");
				} else {
					System.out.printf("%s", (char) a);
				}
			}
		}
		fr.close();
		
		}
		catch(Exception e) {
			System.out.println("파일경로 실패");
		}

	}

}
