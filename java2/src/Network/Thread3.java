package Network;

public class Thread3 {

	public static void main(String[] args) {
		Thread t = new cpus();
		t.start();
		
		Runnable r = new amds();
		Thread t2 = new Thread(r);
		t2.start();
		
		
		int a = 1;
		int sum = 0;
		do {
			sum +=a;
			System.out.println(sum+"(라인 1)");
			a++;
		}while(a<=10);

	}

}

class amds implements Runnable{
	@Override
	public void run() {	
	int a = 1;
	int sum = 0;
	do {
		sum +=a;
		System.out.println(sum+"(라인 3)");
		a++;
	}while(a<=10);
	}
}


class cpus extends Thread{
	@Override
	public void run() {
		int a = 1;
		int sum = 0;
		do {
			sum +=a;
			System.out.println(sum+"(라인 2)");		
			a++;
		}while(a<=10);
	}
}