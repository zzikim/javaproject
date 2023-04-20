package Files;

import java.io.FileWriter;

public class File4 {
	
	public static void main(String[] args) {
	try{
		String userdata[] = {"hong","kim","park","jang","kang"};
		FileWriter fw = new FileWriter("E:\\git_java\\javaproject\\java2\\src\\Files\\message2.txt");
		// FileWriter에 true를 붙이게 되면, 기존 입력사항을 유지하고 추가 데이터 입력.
		int w = 0;
		fw.write("userdb:{");
		do {
			//write = 문자, 배열, 숫자 등 다양한 데이터 값을 파일에 저장하는 명령어
			if(w==userdata.length-1) {
				fw.write(userdata[w]);
			}
			else {
			fw.write(userdata[w]+",");}
			w++;
		}while(w<userdata.length);
		fw.write("}");
		fw.close();
	}
	catch(Exception e) {
		System.out.println("파일오류");
	}
		
	}

}
