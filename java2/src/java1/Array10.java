package java1;

import java.util.Arrays;

public class Array10 {

	public static void main(String[] args) {
		// 숫자 형태의 2차배열
		int data[][] = {
				{1,2,3},
				{3,4,5}
		};
		// 정적배열 형태
		int indata[][] = new int[2][3]; // 0부터시작 x 노드번호아니고 갯수임
		indata[0][0] = 1;
		indata[0][1] = 2;
		indata[0][2] = 3;
		indata[1][0] = 3;
		indata[1][1] = 4;
		indata[1][2] = 5;
		System.out.println(data[0][2]);
		System.out.println(Arrays.toString(data[0]));
		System.out.println(Arrays.toString(indata[0]));
		

	}

}
