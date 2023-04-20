package Network;

public class Thread5 {
	public static void main(String[] args) {
		Thread t = new gu(5);
		Thread t2 = new gu(9);
		t.start();
		t2.start();
}
}

class gu extends Thread{
	int aa = 0;
	public gu(int aa) {
		this.aa = aa;
	}
	@Override
	public void run() {
		int w = 1;
		while(w<=9) {
			System.out.printf("%d * %d = %d\n",aa,w,aa*w);
			w++;
		}		
	}
}
