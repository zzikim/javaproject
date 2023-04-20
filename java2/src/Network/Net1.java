package Network;

import java.net.InetAddress;

public class Net1 {
	//IPv4 : 192.168.0.1, IPv6 : off2:3x12:911h:31xt
	//localhost : 자신의 서버주소
	//TCP : IP형태
	public static void main(String[] args) {
		try {
			// InetAddress : IPnetworkAdress 
			// getByName("접속할 도메인 주소")
			// getHostAddress : 접속하는 서버의 IP주소
			InetAddress ia =InetAddress.getByName("localhost");
			String domain = ia.getHostAddress();
			String ip = ia.getHostAddress();
			System.out.println(ip);
			
			InetAddress ia2[] = InetAddress.getAllByName("naver.com");
			System.out.println(ia2.length);
			
			int w = 0;
			while(w<ia2.length) {
				System.out.println(ia2[w].getHostAddress());
				w++;
			}
		}
		catch(Exception e) {
			
		}

	}

}
