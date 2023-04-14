package java3;

import java.util.ArrayList;
import java.util.Arrays;

public class Array2 {
	// ArrayList, List, Likedlist - 2차배열 선언
	public static void main(String[] args) {
		String data[][] = { { "hong", "kim", "park" }, { "서울", "강원", "경기" } };
		ArrayList<String[]> ar = new ArrayList<String[]>(Arrays.asList(data));
		int ea = ar.size();
		System.out.println(ea); // 배열그룹갯수
		System.out.println(ar.get(0).length); // 첫번쨉 ㅐ열 데이터 갯수
		
		int w = 0;
		while(w<ar.get(0).length) {
			System.out.println(ar.get(0)[w]);
			w++;
		}
	}
}
