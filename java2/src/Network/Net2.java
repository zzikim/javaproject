package Network;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Scanner;

public class Net2 {
	//PORT 접속을 하고자 하는 경로
	/*
	  80 : WEB (http://)
	  443 : WEB (https://)
	  21 : HTTP
	  22 : SSH
	  23 : Telnet
	  23 : SMTP (메일보내기)
	  110 : POP3 (메일받기) - 서버와 비동기화
	  143 : IMAP (메일받기) - 서버와 동기화
	 */
	
	/*
	  UDP 포트
	  SNMP : 문자발송시스템
	  VPN : (가상 IP)	  
	 */
	public static void main(String[] args) {
		try {
			getimage gi = new getimage();
			gi.img();
			}
		catch(Exception e) {
			System.out.println("통신오류 발생!!");
		}
	}

}

class getimage{
	Scanner sc = null;
	InputStream is = null;
	BufferedInputStream bi = null;
	FileOutputStream fs = null;
	public void img() throws Exception {
		this.sc = new Scanner(System.in);
		System.out.println("웹에서 가져올 이미지 주소를 입력해 주세요. ");
		String url = sc.nextLine();
		URL u = new URL(url); //URL(클래스) : 네트워크 경로를 말합니다 (절대경로 형태)
		URLConnection con = u.openConnection(); //해당 경로를 연결하는 것을 말함
		
		System.out.println(con);
		
		int imgsize = con.getContentLength(); //이미지 사이즈
		System.out.println(imgsize);
		String imgtype = con.getContentType(); //이미지 타입형태
		System.out.println(imgtype);
		long date = con.getDate();	//업로드 날짜
		System.out.println(date);
		
		this.is = u.openStream(); //통신에선 opneStream만 사용
		this.bi = new BufferedInputStream(this.is);	//이미지 파일을 임시로 메모리에 저장
		byte data[] = new byte[1024]; //this.bi.available() 해당 파일을 조각냄 1kb = 1024byte
		
		Date today = new Date();
		String filename = today.getDate()+""+today.getTime()+".png";
		
		//file 이름을 해당 경로에 생성만 함
		this.fs = new FileOutputStream("E:\\memo\\seolhyunzzang"+filename);
		
		int imgdata = 0;
		int count = 0;
		while((imgdata=this.bi.read(data))!=-1) {
			this.fs.write(data,0,imgdata); // 조각난 파일을 취합하여 저장시킴
			count += imgdata;
			System.out.println("다운로드 중 ..." + (count *100)/imgsize + "%");
		}
		System.out.println("다운로드 완료 되었습니다.");
		this.fs.flush(); // 메모리 비우기
		this.fs.close();
		this.bi.close();
		this.sc.close();
		this.is.close();
	}
}
