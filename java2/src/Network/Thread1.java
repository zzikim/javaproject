package Network;

public class Thread1 {

	public static void main(String[] args) {
		int w = 0;
		while(w<250) {
			box b = new box(w);
			//System.out.println(b.no);
			//멀티 쓰레드 구성 형태이며 ㅎㅐ당 값을 원하는 작업 공간에 적용
			Thread t = new Thread(b);
			t.start(); // run()메소드 실행
			w++;
		}

	}

}
class box extends Thread{
	int no;
	public box(int a) {
		this.no = a;
	}
	@Override
	public void run() {
		super.run();
		System.out.println(this.no);
	}
}