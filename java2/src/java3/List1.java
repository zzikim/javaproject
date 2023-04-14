package java3;

import java.util.ArrayList;
import java.util.Arrays;

public class List1 {

	public static void main(String[] args) {
		//List 라이브러리
		String member[] = {"박소은","윤준승","김여름"};
		ArrayList<String> al = new ArrayList<>(Arrays.asList(member));
		//arraylist = java의 library 배열 method 
		//arrays.aslist : 로드할 배열값 
		//add(추가),get(배열데이터 로드),remove(삭제),size(배열데이터갯수/length(x))
		// add사용 시 무조건 맨 뒤에 데이터 추가
		// 단, index 번호를 적용 후 값 실행 시 해당 index 부분에 추가가 될 수 있다.
//		int w = 0;
//		while(w<member.length) {
//			al.add(member[w]);
//			w++;
//		}
		al.add(1,"심규환");
		al.add("김지연");
		
		System.out.println(al);
		String user = al.get(4);
		System.out.println(user);
		al.remove(4);
		System.out.println(al);

	}

}
