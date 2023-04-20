package Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

// thread를 이용한 멀티채팅 서버
public class m_server {

	public static void main(String[] args) {{
		chatroom cr = new chatroom();

	}

}
}

class chatroom{
	static final int port = 10001;
	ServerSocket sk = null;
	Socket so = null;
	private String msg = "";
	//배열을 메모리에 저장 시키는 이유는 접속자를 누적시키기 위해 사용
	
	
	public chatroom() {
		try {
			this.sk = new ServerSocket(this.port);
			System.out.println("*****chating*****");
			System.out.println("Chatroom open !!");
			while(true) {
				this.so = this.sk.accept(); //클라이언트 접속허가
				Thread tr = new chat_thread(this.so); //accept 전송
				tr.start();
			}
		}
		catch(Exception e) {
			System.out.println("Port Error!!");
		}
		
	}
}

class chat_thread extends Thread{
	InputStream is = null;
	OutputStream os = null;
	Scanner sc = null;
	private String msg = "";
	static ArrayList<Socket> user = new ArrayList<Socket>();
	public chat_thread(Socket s) { //즉시실행
		try{
			this.user.add(s);
			this.is = s.getInputStream();
			this.os = s.getOutputStream();
		}
		catch(Exception e) {
			System.out.println("Client Excit Error!!");
		}
	}
	@Override
	public void run() {
		try {
			byte data[] = new byte[1024];
			int n = this.is.read(data);
			this.msg = new String(data,0,n);
			System.out.println(this.msg);
			
			// 한명이 입력한 내용을 접속한 모든 사용자에게 메세지로 전달하기 위해
			while(true) {
				this.sc = new Scanner(System.in);
				System.out.println("\n message: ");
				String result = this.sc.nextLine();
				int f;
				for(f=0;f<this.user.size();f++) {
					this.os = this.user.get(f).getOutputStream();
					this.os.write(result.getBytes());
					this.os.flush();
				}
				
			}
		}
		catch(Exception e) {
			System.out.println("Client Exit");
		}
	}
}

