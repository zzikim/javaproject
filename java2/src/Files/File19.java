package Files;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class File19 {
	//Buffered -> read, readLine 사용 시 무조건 메모리 내용을 사용해버림
	//available -?> 메모리 용량만 확인 / 내용은 상관xx
	public static void main(String[] args) {
		try {
			String url = "E:\\git_java\\javaproject\\java2\\src\\Files\\user.txt";
			FileInputStream fs = new FileInputStream(url);
			//(이미지, 동영상 형태)
			//BufferedInputStream bs = new BufferedInputStream(fs);
			//byte[] b = new byte[fs.available()];
			//System.out.println(bs.read());
			//System.out.println(b.length);
			//int files = bs.read(b);
			//System.out.println(b,0,files);
			
			//(문서파일형태)
			InputStreamReader ir = new InputStreamReader(fs);
			BufferedReader br = new BufferedReader(ir);
			System.out.println(br.readLine());
			
			String result;
			while((result=br.readLine())!=null) {
				System.out.println(result);
			}
			
		}
		catch(Exception e) {
			
		}

	}

}
