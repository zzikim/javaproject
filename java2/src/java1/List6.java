package java1;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class List6 {
	//LinkedList : 검색속도가 배열 선언문 중에서 가장 빠름
	//데이터 추가저장, 삭제 빠름
	//단점: 메모리 할당이 높음, 크기변경 못함 (맨 마지막 데이터 부터 저장)
	
	//List, Arraylist : 데이터추가 빠름(단, 순차적으로 저장)
	//단, 단점은 검색 속도가 느림, 삭제 느림 (노드번호가 무조건 0부터 시작)
	public static void main(String[] args) {
		Integer a[] = {1,3,5,7,9};

		System.out.println(ln);
		ln.addFirst(2); // 맨 앞에 넣기
		ln.addLast(30); // 맨 뒤에 넣기
		ln.removeLast();
		ln.remove(); // 맨 앞에가 빠짐
 		Collections.sort(ln);
		System.out.println(ln);
		
		String b[] = {"aa","bb","cc","dd"};
		LinkedList<String> ls = new LinkedList<>(Arrays.asList(b));
		ls.remove("cc");
		ls.addFirst("zz");
		System.out.println(ls);

	}

}
