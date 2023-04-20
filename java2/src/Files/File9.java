package Files;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class File9 {
	//배열로 전송하기 IO
	public static void main(String[] args) {
		try {
			filedata fd = new filedata();
			fd.addfile();
		}	
		catch(Exception e){
			System.out.println("메소드 호출 오류");
		}

}
}

class filedata{
	//라이브러리 : IO ( 기본 input, output), NIO (버퍼를 활용하는 IOㄹㅏ서 성능이 더 좋음)
	//NIO2 = nio를 개선해서 file클래스를 보다 빠르게 출력
	//Files.readAllLines = 파일 전체 모든 텍스트 라인을 읽어들임 -> linkedlist는 파일 전체 라인에 대한 배열값으로 적용하지 못함
	//List(최상위), ArrayList(파생배열) = 일반형식배열 ,  
	ArrayList<String> data = null;
	LinkedList<String> data2 = null;
	public void addfile() throws Exception{
		this.data2 = new LinkedList<String>(Files.readAllLines(Paths.get("E:\\git_java\\javaproject\\java2\\src\\Files\\notice.txt")));
		this.data = (ArrayList<String>)Files.readAllLines(Paths.get("E:\\git_java\\javaproject\\java2\\src\\Files\\notice.txt"));
		System.out.println(data);
		System.out.println(data2);
		
		//원시배열로 처리 (byte단위) : 언어패킷을 사용하지 못하고 1차배열로만 처리
		byte data3[] = Files.readAllBytes(Paths.get("E:\\git_java\\javaproject\\java2\\src\\Files\\notice.txt"));
		System.out.println(new String(data3));
	}
}
