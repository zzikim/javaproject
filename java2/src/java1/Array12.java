package java1;

public class Array12 {

	public static void main(String[] args) {
		int data[][] = { { 11, 42, 22, 16 }, { 7, 33, 10, 29 } };

		int w = 0;
		int sum = 0;
		while (w < data.length) {
			int ww = 0;
			while (ww < data[w].length) {
				if (data[w][ww] % 2 == 0) {
					sum += data[w][ww];
				}
				ww++;
			}
			w++;
		}
		System.out.println(sum);

	}

}
