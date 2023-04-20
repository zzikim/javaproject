package java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Exception7 {

	public static void main(String[] args) {
		
		Object data[] = {"김민수",55,"김민재","민지현",48,"이세현","이수정",34,88};
		
		ua ua = new ua();
		ua.uaaa(data);
		System.out.println(ua.uaa());
		
		
		uam uam = new uam();
		try {
			uam.setter(data);
		}
		catch(Exception e) {
			if (e.getMessage() != null) {
			System.out.println(e); 
		}			
		}
		System.out.println(uam.getter());
	}

}

class ua {
	private ArrayList<Object> rdata;
	
	public ArrayList<Object> uaa() {
		
	return rdata;	
	
	}
	
	public void uaaa(Object datas[]) {
		try {
		rdata = new ArrayList<>(Arrays.asList());
		int w = 0;
		int ea = datas.length;
		while(w<ea) {
			if(datas[w].getClass().getName().equals("java.lang.String")) {
				rdata.add(datas[w]);				
			}			
			
			w++;		
		}}
		catch(Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e); 
			}			
		}
	}
}


class uam{
	LinkedList<String> ls = new LinkedList<>(Arrays.asList()); // 빈 배열 생성
	LinkedList<Integer> ar = new LinkedList<>(Arrays.asList ());
	public void setter(Object call[]) throws Exception {		
				int ea = call.length;
				int w = 0;
				while(w<ea) {	// 문자만 배열에 입력, 숫자 자료형일 경우 ㅇㅖ외처리 
					try {
						String check = String.valueOf((String)call[w]);
						this.ls.add(check);
					}catch(Exception ex) { // 반복문이라 예외처리가 가능함
						int check2 = Integer.valueOf((int)call[w]);
						this.ar.add(check2);
					}
					w++;
				}
				System.out.println(ar);
	}
	public LinkedList<String> getter() {
		return this.ls;
		//데이터 출력 return
	}
}