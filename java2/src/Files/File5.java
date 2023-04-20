package Files;

import java.io.FileWriter;
import java.util.Scanner;

public class File5 {

	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			FileWriter fw = new FileWriter("E:\\git_java\\javaproject\\java2\\src\\Files\\user.txt",true);
			int w = 1;
			while(w<=5) {				
				System.out.println("사용자 이이디를 입력하세요?");
				fw.write(w+"번째입력:"+sc.next()+"\n");
				w++;
			}			
			sc.close();
			fw.close();
			System.out.println("아이디 찾으세요");
		}
		catch(Exception e) {
			System.out.println("파일오류");
		}

	}

}
