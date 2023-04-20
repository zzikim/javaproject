package Network;

public class Theread2 {

	public static void main(String[] args) {
		String user1[] = {"hong","park","kim","jang","han"};
		String user2[] = {"lee","yoon","hwang","jo","ko"};
		listprint lp = new listprint();
		int w = 0;
		while(w<user1.length) {
			String result = lp.view(user1[w]);
			//System.out.println(result);
			w++;
		}
		int w2 = 0;
		while(w2<user2.length) {
			String result2 = lp.view(user2[w2]);
			//System.out.println(result2);
			w2++;
		}
		
		//멀티 thread 반복문
		int a = 0;
		listprint2 lp2 = null;
		listprint2 lp3 = null;
		Thread th2 = null;
		Thread th3 = null;
		do { 
			lp2 = new listprint2(user1[a]);//객체 생성 후 메소드로 전달
			lp3 = new listprint2(user2[a]);
			th2 = new Thread(lp2);//thread 이용하여 해당 데이트 처리
			th3 = new Thread(lp3);
		//	th2.start();//각각의 thread가 작동되도록 함
		//	th3.start();
			a++;
		}while(a<user1.length);
		
		Thread tt1 = null;
		Thread tt2 = null;
		Thread tt3 = null;
		Thread tt4 = null;
		try {
		int k = 0;
		while(k<user1.length) {
			lp2 = new listprint2(user1[k]);
			tt1 = new Thread(lp2);
			tt2 = new Thread(lp2);
			tt3 = new Thread(lp2);
			tt4 = new Thread(lp2);
			tt1.start(); //멀티쓰레드 작업시작
			tt1.join(); //작업종료와 관계없이 순차적으로 결과가 나오도록 조정
			tt2.start();
		//	tt3.start();
		//	tt4.start();
			k++;
		}
		}
		catch(Exception e) {
			
		}
		
	}

}

//단일 thread
class listprint{
	public String view(String data) {
		return data;     
	}
}

//멀티 thread
class listprint2 extends Thread{
	String usernm = "";
	public listprint2(String z) {
		this.usernm = z;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println("Theread error");
		}
		System.out.println(this.usernm);
	}
}

//멀티 thread2
class listprint3 implements Runnable{
	@Override
	public void run() {
		
	}
}