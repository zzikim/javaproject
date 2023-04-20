package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.LineNumberReader;

public class File8 {
	//BufferReader (output) cpu 캐시메모리 임시저장
	// 배열에 값을 빠르게 배분하여 활용 할 수 있도록 함. // Arraylist 등
	public static void main(String[] args) throws Exception {
		buffer bf = new buffer();
		bf.dataview();
	}

}

class buffer{
	FileReader fr = null;
	FileReader fr2 = null;
	BufferedReader br = null;
	public void dataview() throws Exception {
		//파일 객체 한번 인스턴스 로드
		this.fr = new FileReader("E:\\git_java\\javaproject\\java2\\src\\Files\\notice.txt");
		this.br = new BufferedReader(this.fr);
		//새롭게 생석된 객체 인스턴스 로드
		this.fr2 = new FileReader("E:\\git_java\\javaproject\\java2\\src\\Files\\notice.txt");
		LineNumberReader li = new LineNumberReader(this.fr2);
		int ea = 0;
		while(li.readLine()!=null) {
			ea = li.getLineNumber();
		}
		System.out.println(ea);
		// 조건문에 buffered readline 사용시 해당 첫번째 라인은 캐시메모리에서 삭제됨
		//buffer는 무조건 한번 사용시 다음라인으로 이동
		/*if(this.br.readLine()!=null) {
			System.out.println(this.br.readLine());
		}*/
		String text = "";
		while((text=this.br.readLine())!=null) {
			System.out.println(text);
		}
	//	System.out.println(this.br.readLine());
		/*while(true) {
			String text = this.br.readLine();
			System.out.println();
		}*/
		
	}
}