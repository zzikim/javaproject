package Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class chat_client {
	// 채팅클라이언트
	public static void main(String[] args) {
		chat_cl ch = new chat_cl();
		ch.client();
	}
}

class chat_cl {
	private String ip = "192.168.10.151";
	private int port = 10001;
	Socket so = null;
	Scanner sc = null;
	String cms = "";
	InputStream is = null;
	OutputStream os = null;
	private String mid = "";
	private String msg = "";

	public void client() {
		try {
			this.sc = new Scanner(System.in);
			System.out.println("Make your nickname : ");
			this.mid = this.sc.nextLine();
			int count = 0;
			while (true) {
				this.so = new Socket(this.ip, this.port);
				this.is = this.so.getInputStream(); // 서버에서 받아오는 메세지
				this.os = this.so.getOutputStream(); // 서버로 보내는 메세지
				if (count == 0) {
					this.msg = "[" + this.mid + "] admission complete !!"; // 최초 서버로 보내는 메세지
					this.os.write(this.msg.getBytes());
					this.os.flush();
				} else {
					this.sc = new Scanner(System.in);
					System.out.println("\n[" + this.mid + "] : ");
					cms = this.sc.nextLine();					
				}
					if (cms.equals("exit")) {
						this.msg = "chatroom out";
						// 서버로 메세지 전송
						this.os.write(this.msg.getBytes());
						this.os.flush();						
						this.is.close();
						this.sc.close();
						break;
					} else {
						this.msg = "\n[" + this.mid + "] : " + cms;
						// 서버로 메세지 전송
						this.os.write(this.msg.getBytes());
						this.os.flush();
					}
					count++;				


				// 서버에서 온 메세지 받는 코드
				byte msg[] = new byte[1024];
				int n = this.is.read(msg);
				String servertext = new String(msg, 0, n);
				System.out.println(servertext);
				System.out.println("");

			}
		} catch (Exception e) {
			System.out.println("!!!!!Server Connect Error!!!!!");
		}
	}

}