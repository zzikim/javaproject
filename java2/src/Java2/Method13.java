package Java2;

import java.util.Scanner;

public class Method13 {

	public static void main(String[] args) {
		gugudan2 gg = new gugudan2();
		gg.gugu();

	}

}

class gugudan{
	protected int number;
	Scanner sc = new Scanner(System.in);
	public void gugu() {
		System.out.println("구구단 몇단 알려줄까");
	}
	public void result(int no) {		
	}
}

class gugudan2 extends gugudan{	
	 @Override
	public void gugu() {
		super.gugu();
		this.number = sc.nextInt();
		result(this.number);
	}
	@Override
	public void result(int no) {
		super.result(no);
		int w = 1;
		while(w<=9) {
			System.out.printf("\n%d 곱하기 %d(은)는 %d ^_^~!",no,w,no*w);
			w++;
		}
	}
}