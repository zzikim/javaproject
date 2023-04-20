package java3;

import java.util.Arrays;

public class Exception3 {

	public static void main(String[] args) {
	String data[] = {"1,000","2,000","3,000","4,000","5,000"};
	method2 mt = new method2();
	try {
	mt.total1_method(data);
	}
	catch(Exception e) {
		System.out.println("해당 데이터는 문자여서 합산 불가");
	}
	finally {
		// 원시 배열로 받는 method는 원시배열값으로 보내야함
		// ArrayList, List, linkedList , Map 일 경우 일반인자값으로 보내야함.
		// ArrayList<String> rdata = new ArrayList<>(); -> 못보냄.
		
		String rdata[] = new String[data.length];
		
		int j = 0;
		while(j<data.length) {
			rdata[j]=data[j].replaceAll(",","");
			j++;
		}			
		// 다시 해당 메소드를 호출 시 try , catch 적용
		try {
		mt.total1_method(rdata);
		}
		catch(Exception e) {
			//catch에는 sysout 사용하지 않음.
			e.getMessage(); // 문제 발생시에만 출력
		}
	}

}
}

class method2{
public void total1_method(String db[]) throws Exception{
	System.out.println(Arrays.toString(db));
	int w = 0;
	int ea = db.length;
	int sum = 0;
	while(w<ea) {
		sum+=Integer.valueOf(db[w]);
		w++;
	}
	System.out.println("총 합계는 "+sum);
	Exception ex = new Exception();
	throw ex;
}
	
}

