package java1;

import java.util.Arrays;
import java.util.Scanner;

public class Random2 {

	public static void main(String[] args) {

		int rd[] = new int[6];
		int w = 0;
		while (w < 6) {
			rd[w] = (int) Math.ceil(Math.random() * 46);
			w++;
		}
		System.out.println(Arrays.toString(rd));
	}

}
