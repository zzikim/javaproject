package Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class chat_server {
	//채팅서버
	public static void main(String[] args) {
		chat_sv cs = new chat_sv();
		cs.chatserver();
	}
}
class chat_sv{
	private int port = 10001;
	private String mid = "";
	private String msg = "";
	ServerSocket sk = null;
	Socket so = null;
	Scanner sc = null;
	InputStream is = null;
	OutputStream os = null;
	public void chatserver() {
		try {
			this.sk = new ServerSocket(this.port);
			this.sc = new Scanner(System.in);
			System.out.println("Server Owner Nickname:"); //방 개설자 아이디
			this.mid = sc.next();
			System.out.println("\n"+this.mid+"'s Chating Room Open");
			
			while(true) {
				this.so = sk.accept();
				this.is = this.so.getInputStream();  //클라언트에게 받는 메세지
				
				//클라이언트 메세지를 출력하는 코드
				this.os = this.so.getOutputStream(); //클라이언틍게 보내는 메세지
				byte msg[] = new byte[1024];
				int n = this.is.read(msg);
				System.out.println("");
				String text = new String(msg,0,n); 
				System.out.println(text); // 클라이언트 입장 메세지(채팅메세지)
				//클라이언트 메세지를 출력
				
				
				//서버에서 클라이언트로 메세지를 전송하는 코드
				this.sc = new Scanner(System.in);
				System.out.println("\n["+this.mid+"] : ");
				text = this.sc.nextLine();		
				if(text.equals("exit")) {
					this.sk.close();
					this.so.close();
					this.os.close();
					this.is.close();					
					break;
				}
				String cms = "\n[(Owner)"+this.mid+"] : "+text; 
				this.os.write(cms.getBytes());
				this.os.flush();
			}
		}
		catch(Exception e) {
			System.out.println("Port Connect Error!!");
		}
		
	}
	
}