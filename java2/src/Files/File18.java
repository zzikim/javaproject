package Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class File18 {
	//Stream을 사용하고 나서 bufferd사용
//Buffered : read, write 단독으로 사용 xx
	//read : int형태, readLine : String형태
	
/*
 InputStream > InputStreamreader > BufferedReader (o)
 InputStream > BufferedInputStream (o)
 InputStreamreader > BufferedReader (o)
 
 **** BufferReader - close() 메모리 종료 필수
 	  BufferedWrite - flush() 메모리 초기화 + close() 메모리 종료
 */
	
	
	public static void main(String[] args) {
		try{
		OutputStreamWriter os = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(os);
		bw.write("홍길동");
		bw.close();
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String test = br.readLine();
		System.out.println(test);
		/*
		 FileInputStream = > BufferdInputStream
		 FileOutputStream = > BufferdOutputStream
		 */
		
		
		}
		catch(Exception e) {
			
		}
		
	}

}
