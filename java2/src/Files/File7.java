package Files;

import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

public class File7 {

	public static void main(String[] args) {
		array a = new array();
		try {
		a.view();
		}
		catch (Exception e){
			System.out.println("메소드 함수 오류");
		}

	}

}
class array{
	FileReader fr = null;
	Scanner sc = null;
	ArrayList<ArrayList<String>> members = null; 
	ArrayList<String> member = null; 
	ArrayList<String> dustmq = null; 
	public void view() throws Exception {
	members = new ArrayList<>();
	dustmq = new ArrayList<>();
	this.fr = new FileReader("E:\\git_java\\javaproject\\java2\\src\\Files\\member.txt",Charset.forName("UTF8"));
	this.sc = new Scanner(this.fr);
	while(this.sc.hasNext()) { 
		member = new ArrayList<>();
		int w = 0;
		String aa = this.sc.nextLine();
		while(w<aa.split(",").length) {
			this.member.add((aa.split(",")[w]));
			w++;
		}
		members.add(member);
	}
	System.out.println(members);
	this.fr.close();
	this.sc.close();
	}
	
	//원시배열 섞인 2차배열 한번에 보기 -> Arrays.deepToString(배열.toArray()));
}
