package java1;

import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
		String Data1[] = { "대한민국", "일본", "중국", "베트남", "태국" };
		int Data2[] = { 40, 35, 70, 55, 32 };
		String Total[] = new String[Data1.length];
		int w = 0;
		while (w < Data1.length) {
			//Total[w] = Data1[w] + "(" + String.valueOf(Data2[w]) + ")";
			Total[w] = Data1[w] + "(" + Integer.toString(Data2[w]) + ")"; //Integer.toString => 숫자를 문자로 변경
			// Total[w] = Data1[w] + "(" + Data2[w] + ")";                //Integer.parseInt : 문자를 숫자로 변경
			w++;
		}
		System.out.println(Arrays.toString(Total));

	}

}
