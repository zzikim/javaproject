package java3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class File12 {
	//file load using Stream
	public static void main(String[] args) {
		try {
			filein fi = new filein();
			fi.fileload();
		}
		catch(Exception e)
		{
			System.out.println("메소드 오류");
			}	
	}

}
class filein{
	InputStream is = null;
	public void fileload() throws Exception {
		this.is = new FileInputStream("E:\\git_java\\javaproject\\java2\\src\\Files\\notice.txt");
		//available : 파일의 용량 크기 확인 (byte단위)
		System.out.println(is.available());
		//byte 배열 값을 해당 파일의 크기와 동일하게 생성
		byte temp[] = new byte[is.available()];
		//System.out.println(Arrays.toString(temp));
		byte temps[] = new byte[1024*16]; // 용량범위 정해두기
		int ea = this.is.read(temp);
		System.out.println(ea);
		String data = new String(temp);
		System.out.println(data);
		
		//read 없을때
		String data2 = new String(temp,0,this.is.read(temp));
		System.out.println(data2);
	}
}