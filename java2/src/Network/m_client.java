package Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//thread를 이용한 멀티채팅 클라이언트
public class m_client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n What's your name? XD : ");
		String mid = sc.nextLine().intern();
		if(mid=="") {
			System.out.println("pleas enter your name");
		}
		else {
		mchat m = new mchat(mid);
		}
	}
}
class mchat{
	static final int port = 10001;
	ServerSocket sk = null;
	Socket so = null;
	Scanner sc = null;
	InputStream is = null;
	OutputStream os = null;
	private String ip = "192.168.10.151";
	private String msg = "";
	public mchat(String id) {
		try {
			this.so = new Socket(this.ip, this.port);
			this.is = this.so.getInputStream();
			this.os = this.so.getOutputStream();
			this.msg = "[" + id + "] admission complete !!";
			this.os.write(msg.getBytes());
			this.sc = new Scanner(System.in);
			System.out.println();
			
		}
		catch(Exception e) {
			System.out.println("Server Error!!!!");
		}
		
	}
}