package Network;
//응용편 멀티쓰레드
public class Thread4 {
	
	static int money = 50000; // 통장 잔고
	
	public static void main(String[] args) {
		
		Runnable ra2 = new outmoney(); // 출금
		Thread th2 = new Thread(ra2);
		th2.start();
		
		Runnable ra = new inmoney();
		Thread th = new Thread(ra);
		th.start();
		
	}
}

class outmoney implements Runnable{
	public void run() {
		int out[] = {15000,25000,16000};
		int w = 0;
		do {
			System.out.println("(출금) -"+out[w]+"\n잔액 : "+Thread4.money+"원");
			Thread4.money = Thread4.money - out[w];
			w++;
		}while(w<out.length);
	}
}

class inmoney implements Runnable{ //입금
	@Override
	public void run() {
		int plusmoney = 30000;
		Thread4.money = Thread4.money + plusmoney;
		System.out.println("(입금) +"+plusmoney+"원\n잔액 : "+Thread4.money+"원");
	}
}
