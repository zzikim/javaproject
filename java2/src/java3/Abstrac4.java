package java3;

import java.util.Arrays;

public class Abstrac4 {


	public static void main(String[] args) {
		abab1 aa = new abab1();
		aa.datalist();
		aa.result();

	}

}
class abab1 extends sum_total{
	int data1[] = {1, 10, 15, 19, 8, 4, 7, 0, 2, 3, 9, 12};
	@Override
	public void datalist() {
		Arrays.sort(data1);
	}
	@Override
	public void result() {
		int w=0;
		while(w<data1.length) {
			sum += data1[w];
			w++;
		}
		System.out.println(sum);
	}
}