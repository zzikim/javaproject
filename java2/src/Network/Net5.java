package Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Net5 {

	// socekt 통신 : server , client 양방향 통신
	// http 통신 : image , 동영상 , 음악 등 사용자 요청에 맞춰서 송수신 통신(단방향)

	// 양방향 : 자동 업데이트
	public static void main(String[] args) {

		System.out.println("Server Connect");
		int port = 9001; // 포트번호 셋팅
		try {
			ServerSocket ss = new ServerSocket(port); // 오픈시킬 포트를 적용
			while (true) {
				System.out.println("server loading...");
				// accept : 클라이언트가 접속하는것을 대기하는 역할을 하게됨
				Socket sc = ss.accept(); // 대기

				// client가 접속 했을 경우 해당 라인 시작
				// 접속완료
				System.out.println("host connect success!");

				// sever에서 client로 받는 통로
				InputStream is = sc.getInputStream();

				// client로 보내는 통로
				OutputStream os = sc.getOutputStream();
				
				byte data[] = new byte[1024]; //client에서 받는 텍스트를 byte로 받음
				int n = is.read(data); //해당 값을 읽어들임
				
				//문자 자료형으로 변환
				String magclient = new String(data, 0, n);
				//출력
				System.out.println(magclient);
				
				//client로 메세지 성공
				String aws = "hey client hello~"; //서버에서 보내는 메세지
				os.write(aws.getBytes());//클라이언트로 보내기 위한 메모리 저장
				os.flush();
				os.close();
				is.close();
				sc.close();

			}
		} catch (Exception e) {
			System.out.println("Server Connect error!!");
		}

	}

}